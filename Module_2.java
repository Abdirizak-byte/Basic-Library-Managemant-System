public class Module_2 {
	
	public void Chemistry() {
		
		String chem[] = {"Organic Chemistry","Physical Chemistry","Bio Chemistry","Inorganic Chemistry","Polymer Chemistry"};
		
		System.out.println("The books available for Chem class: ");
		
		for (int i=0; i < chem.length; i++) {
			
			System.out.println(chem[i]);
		}
	}
	
	public void Physics() {
		
		System.out.println("The books available for Phys class: ");
		
		String phys[] = {"Mechanics","Dynamics","Solid State Physics","Astro Physics","Electromagetism"};
		
		for (int j=0; j < phys.length; j++) {
			
			System.out.println(phys[j]);
		}
		
	}
	
	public void Biology() {
		
		System.out.println("The books available for Bio class: ");
		
		String bio[] = {"Zoology","Botnay","Medical Science","Oceangraphy","xyz"};
		
		for (int k=0; k < bio.length; k++) {
			
			System.out.println(bio[k]);
		}
		
	}
}
