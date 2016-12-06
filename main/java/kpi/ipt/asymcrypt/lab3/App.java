package main.java.kpi.ipt.asymcrypt.lab3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Roman Horilyi
 */
public class App {

    public static void main(String[] args) {
        simulateAttack();
    }

    public static void simulateAttack() {
        ZeroKnowledgeProtocolAttack attack = new ZeroKnowledgeProtocolAttack();

        System.out.println("Enter modulus: ");
        Scanner scanner = new Scanner(System.in);
        BigInteger modulus = new BigInteger(scanner.next(), 16);
        attack.setModulus(modulus);

        int numberOfAttacks = attack.makeAttack(0);
        System.out.println("Number of attacks: " + numberOfAttacks);
    }
}
