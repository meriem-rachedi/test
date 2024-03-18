package exercice3;

import java.util.Scanner;
public class applicationetudiant {

	public static void main(String[] args) {
		
		etudiant e1 = new etudiant();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le matricule :");
		long mat = sc.nextLong();
		System.out.println("saisir le nom :");
		String nom = sc.next();
		System.out.println("saisir le prenom :");
		String prenom = sc.next();
		System.out.println("saisir le semestre :");
		int semestre = sc.nextInt();
		System.out.println("saisir le session :");
		String session = sc.next();
		
		etudiant e2 = new etudiant(mat, nom, prenom, semestre , session );
		etudiant e3 = new etudiant(123456, "rachedi", "meriem", 4 , "bien"); 
		
		System.out.println("etudiant 1:");
		e1.afficher();
		System.out.println("etudiant 2:");
		e2.afficher();
		System.out.println("etudiant 3:");
		e3.afficher();
		
		System.out.println("la moyenne de etudiant 3 est:");
		System.out.println("la moyenne est : "+e3.calculemoyenne(11.25, 9.25, 12.0));
		System.out.println("la moyenne est : "+e3.calculemoyenne(10, 9, 11));
		System.out.println("la moyenne est : "+e3.calculemoyenne(15.5, 13.25));
		
		System.out.println("etudiant 1 apres affectation :");
		e1 = e3;
		e1.afficher();
		
		//e1 = null;
		//e1.afficher();
		
		System.out.println("saisir la taille de tableau :");
		int n = sc.nextInt();
		
		etudiant tab[] = new etudiant[n];
		
		for(int i=0 ; i<n ;i++) {
			tab[i]= new etudiant(mat,nom,prenom,semestre,session);
			System.out.println("entrer les information de etudiant n "+(i+1)+":");
			System.out.println("saisir le matricule :");
			long mat1 = sc.nextLong();
			System.out.println("saisir le nom :");
			String nom1 = sc.next();
			System.out.println("saisir le prenom :");
			String prenom1 = sc.next();
			System.out.println("saisir le semestre :");
			int semestre1 = sc.nextInt();
			System.out.println("saisir le session :");
			String session1 = sc.next();
				
		}
		
		// autre methode pour Remplir le tableau en utilisant la lecture à partir du clavier

		/*for(int i=0 ; i<n ;i++) {
			tab[i]= new etudiant();
			System.out.println("entrer les information de etudiant n "+(i+1)+":");
			System.out.println("saisir le matricule :");
			long mat1 = sc.nextLong();
			System.out.println("saisir le nom :");
			String nom1 = sc.next();
			System.out.println("saisir le prenom :");
			String prenom1 = sc.next();
			System.out.println("saisir le semestre :");
			int semestre1 = sc.nextInt();
			System.out.println("saisir le session :");
			String session1 = sc.next();
			
			tab[i].setmatricule(mat1);
			tab[i].nom = nom1;
			tab[i].prenom = prenom1;
			tab[i].semestre = semestre1;
			tab[i].session = session1;
				
		}*/
		
		for(int i=0 ; i<n ;i++) {
			System.out.println(" les information de etudiant n "+(i+1)+"est:");
			tab[i].afficher();
		}
		
		System.out.println(" le nombre d`etudiant est : "+etudiant.nbetudiant);
		
	}
	
	

}
