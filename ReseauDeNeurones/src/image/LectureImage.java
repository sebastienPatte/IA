package image;
import mnisttools.MnistReader;
 
public class LectureImage {
 
    public static void main(String[] args) {
        String path="/home/tp-home006/spatte/workspace/ReseauDeNeurones/db/"; // TODO : indiquer le path correct
        String labelDB=path+"train-labels-idx1-ubyte";
        String imageDB=path+"train-images-idx3-ubyte";
        // Creation de la base de donnees
        MnistReader db = new MnistReader(labelDB, imageDB);
        // Acces a la premiere image
        int idx = 1; // une variable pour stocker l'index
                    // Attention la premiere valeur est 1.
        int [][] image = db.getImage(idx);
        // Son etiquette ou label
        int label = db.getLabel(idx);
        // Affichage du label
        System.out.print("Le label est "+ label+"\n"); 
        // note: le caractère \n est le 'retour charriot' (retour a la ligne).
        // Affichage du nombre total d'image
        System.out.print("Le total est "+ db.getTotalImages()+"\n");
        /* A vous de jouer pour la suite */
        int seuil = 150;
        binarisation(image,seuil);
        
    }
    
    public static int[][] binarisation(int[][] image, int seuil){
    	for(int i=0 ; i<image.length;i++){
        	for(int j=0; j<image[i].length;j++){	
        		if(image[i][j]>seuil){
        			System.out.print("X");
        		}else{
        			System.out.print(" ");
        		}
        		
        	} System.out.print("\n");
        }
    	return image;
    }
 
}