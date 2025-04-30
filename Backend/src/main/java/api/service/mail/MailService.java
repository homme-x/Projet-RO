package api.service.mail;

import org.springframework.stereotype.Service;

@Service
public class MailService {

    public void sendCodesByEmail(String email, String publicCode, String privateCode) {
        System.out.println("[DEV MODE] Simulation d'envoi de mail à " + email);
        System.out.println("Code Public: " + publicCode);
        System.out.println("Code Privé: " + privateCode);
    }

    public void sendRelationshipConfirmationEmail(String sourceMemberEmail, String confirmationCode) {
        System.out.println("[DEV MODE] Simulation d'envoi de mail de confirmation à " + sourceMemberEmail);
        System.out.println("URL de confirmation: http://localhost:3000/confirm-relationship/" + confirmationCode + "?accept=true");
        System.out.println("URL de refus: http://localhost:3000/confirm-relationship/" + confirmationCode + "?accept=false");
    }

}
