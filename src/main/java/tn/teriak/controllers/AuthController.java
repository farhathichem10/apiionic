package tn.teriak.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.teriak.model.Role;
import tn.teriak.model.User;
import tn.teriak.payload.request.LoginRequest;
import tn.teriak.payload.request.SignupRequest;
import tn.teriak.payload.response.JwtResponse;
import tn.teriak.payload.response.MessageResponse;
import tn.teriak.repository.RoleRepository;
import tn.teriak.repository.UserRepository;
import tn.teriak.security.jwt.JwtUtils;
import tn.teriak.security.services.UserDetailsImpl;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/signin")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(loginRequest.getMatricule(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = jwtUtils.generateJwtToken(authentication);
    
    UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
                         "Bearer", userDetails.getId(), 
                         userDetails.getUsername(), 
                         userDetails.getEmail(), 
                         roles, userDetails.getSignataire(),userDetails.getSite(),userDetails.getNomPrenom(),userDetails.getService(),userDetails.getFonction(),userDetails.getMatricule(),userDetails.getSolde_Conge(),userDetails.getSociete(),userDetails.getDirection(),userDetails.getDernier_maj_solde_conge()));
  }

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByMatricule(signUpRequest.getMatricule())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Username is already taken!"));
    }

    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
      return ResponseEntity
          .badRequest()
          .body(new MessageResponse("Error: Email is already in use!"));
    }

    // Create new user's account
    User user = new User(signUpRequest.getUsername(), signUpRequest.getMatricule(),
            signUpRequest.getEmail(),
            encoder.encode(signUpRequest.getPassword()), signUpRequest.getNom(), signUpRequest.getPrenom(), signUpRequest.getSignataire(), signUpRequest.getDate_naissance(), signUpRequest.getRecrutement(), signUpRequest.getService(), signUpRequest.getEmailConfirmed(), signUpRequest.getSolde_Conge(), signUpRequest.getDernier_maj_solde_conge(), signUpRequest.getEtat(), signUpRequest.getStatus(), signUpRequest.getNomPrenom(), signUpRequest.getSociete(), signUpRequest.getNumPost(), signUpRequest.getDirection(), signUpRequest.getGroupe(), signUpRequest.getDate_DernierPret(), signUpRequest.getNbrPret(),signUpRequest.getPL(), signUpRequest.getPhoto_profil(), signUpRequest.getResp_dep(), signUpRequest.getFonction(), signUpRequest.getSite(), signUpRequest.getDate_recrutement(), signUpRequest.getPhoneNumber(),signUpRequest.getPhoneNumberConfirmed());
    Integer intRoles = signUpRequest.getRole();
    Set<Role> roles = new HashSet<>();
    Role userRole = roleRepository.findById(intRoles)
            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
        roles.add(userRole);
		/*
		 * if (strRoles == null) { Role userRole =
		 * roleRepository.findByName(ERole.ROLE_USER) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(userRole); } else {
		 * strRoles.forEach(role -> { switch (role) { case "admin": Role adminRole =
		 * roleRepository.findByName(ERole.ROLE_ADMIN) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(adminRole);
		 * 
		 * break; case "mod": Role modRole =
		 * roleRepository.findByName(ERole.ROLE_MODERATOR) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(modRole); break;
		 * case "rh": Role rhRole = roleRepository.findByName(ERole.ROLE_RH)
		 * .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		 * roles.add(rhRole); break; default: Role userRole =
		 * roleRepository.findByName(ERole.ROLE_USER) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(userRole); } }); }
		 */

    user.setRoles(roles);
    userRepository.save(user);

    return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
  }
  @GetMapping("/getall")
	public List<Role>  getall(){
		return (List <Role>) roleRepository.findAll();
	}
  @GetMapping("/getuser/{id}")
 	public Optional<User> getalluser(@PathVariable("id")int id){
 		return  userRepository.findById(id);
 	}
  @GetMapping("/getbonjour")
	public String getBonjour(){
		return  "bonjour";
	}
 
  
 

 
}
