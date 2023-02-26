package jazminquimica;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

	
public class MensajeImage{

static String pedir;
static Scanner scanner = new Scanner(System.in); 
static int select = -1; 

       public static void main(String[] args) {
           UIManager um = new UIManager();
                        
         JOptionPane.showMessageDialog(null, "", "PROYECTO QUÍMICA GENERAL U1",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/ITSAVVV (2).jpg"));
     
                        um.put("OptionPane.messageForeground", Color.WHITE);
		        um.put("Panel.background",Color. DARK_GRAY);
                        um.put("OptionPane.background", Color.DARK_GRAY); 
         JOptionPane.showMessageDialog(null, "BIENVENIDO/A AL PROYECTO DE LA UNIDAD 1 DE QUÍMICA GENERAL"
                 + "\n            "
                 + "\n-Unidad 1: Teoría cuántica y estructura atómica"
                 + "\n-Docente: Ing. Química Jazmín Morales Ramón"
                 + "\n-Grupo: ISC 2do Semestre    "
                 + "\n-Equipo: Usos tecnológicos por emisiones electrónicas"
                 + "\n-Periodo: Febrero-Agosto 2023"
                 + "\n-Campus: Medellín"
                , "BIENVENIDO/A",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Goku.jpg"));
         
 
         
		while(select != 0){
                
			try{    
			um.put("OptionPane.messageForeground", Color.WHITE);
		        um.put("Panel.background",Color. DARK_GRAY);
                        um.put("OptionPane.background", Color. DARK_GRAY); 

                            String lectura = JOptionPane.showInputDialog(null,"\nIntroduzca el número del elemento que desea consultar:"
                                        + "\n-(Presione 0 para salir)");
			
				select = Integer.parseInt(lectura);
                 
	
                        switch(select){
				
                            case 1 :
                                
                                JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Hidrógeno"
                                                +"\n           "
                                                + "\nSÍMBOLO: H"
                                                +"\n           "
                                                + "\nCATEGORÍA: Halógenos"
                                                +"\n           "
                                                + "\nEmisión electrónica: 1s^1"
                                        +"\n           "
                                                + "\nUsos te0cnológicos: \n-Fabricación de combustibles tradicionales"                                                + "\n-Fuente de energía en celdas de combustible."
                                                + "\n-Respaldo de la energía producida a partir de turbinas eólicas "
                                                + "y paneles solares.");
                                
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Hidrógeno",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Hidrogeno.jpg"));
					break;
                                        
                                        
                            case 2: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Helio"
                                        +"\n           "
                                                + "\nSÍMBOLO: He "
                                        +"\n           "
                                                + "\nCATEGORÍA: Gases nobles"
                                        +"\n           "
                                                + "\nEmisión electrónica: 1s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Globos aerostáticos.  "
                                                + "\n-Uso en láseres. "
                                                + "\n-Fabricación de refrigerantes para lograr temperaturas muy bajas. ");
                                             
                                 
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Helio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Helio.jpg"));
					break;
                                        
                                        
                                        
				case 3: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Litio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Li"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal alcalino"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^1 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Para aleaciones de aluminio. "
                                                + "\n-Utensilios varios (principalmente cocina. "
                                                + "\n-Baterías para dispositivos móviles y portatiles.  ");
                                 
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Litio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Litio.jpg"));
					break;
                                        
                                        
				case 4: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Berilio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Be"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Creación de aleaciones de cobre.  "
                                                + "\n-Fabricación de máquinas de rayos X. "
                                                + "\n-Usos varios en la industria aeroespacial.  ");
                                 
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Berilio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Berilio.jpg"));
                                        break;
                                        
                                        
                                case 5: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Boro"
                                        +"\n           "
                                                + "\nSÍMBOLO: B"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de equipo deportivo (palos de golf,etc.).  "
                                                + "\n-Usado en fertilizantes.  "
                                                + "\n-Creación de semiconductores eléctricos.  ");
                                
                                   JOptionPane.showMessageDialog(null, "Este es el elemento.", "Boro",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Boro.jpg"));
                                        break;
                                        
                                        
                                case 6: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Carbono"
                                        +"\n           "
                                                + "\nSÍMBOLO: C "
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-De él derivan muchos hidrocarburos. "
                                                + "\n-La mayor parte de componentes eléctricos son fabricados con carbono.  "
                                                + "\n-El carbono es usado en los polímeros como: plásticos, Fibras, adhesivos, etc.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Carbono",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Carbono.jpg"));
					break;
                                        
                                        
                                case 7: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Nitrógeno"
                                        +"\n           "
                                                + "\nSÍMBOLO: N "
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^3"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Usado para fertilizantes.  "
                                                + "\n-Usado en refrigerantes. "
                                                + "\n-Útil para la creación de explosivos como el TNT.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Nitrógenoo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Nitrogeno.jpg"));
                                        break;
                                        
                                        
                                 case 8: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Oxígeno"
                                        +"\n           "
                                                + "\nSÍMBOLO: O"
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^4"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Tratamiento de aguas residuales.  "
                                                + "\n-Fabricación de vidrio.  "
                                                + "\n-Usos en la acuicultura.  ");
                                 
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Oxígeno",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Oxígeno.jpg"));
                                        break; 
                                        
                                        
                                 case 9: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Flúor"
                                        +"\n           "
                                                + "\nSÍMBOLO: F"
                                        +"\n           "
                                                + "\nCATEGORÍA: Halógenos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^5 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Muy usado para crear iluminación incandescente.  "
                                                + "\n-Antiadherentes como el teflón.  "
                                                + "\n-Refrigerantes CFC tipo freón. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Flúor",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Flúor.jpg"));
                                        break;
                                        
                                        
                                 case 10: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Neón"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ne"
                                        +"\n           "
                                                + "\nCATEGORÍA: Gases nobles"
                                        +"\n           "
                                                + "\nEmisión electrónica: 2s^2 2p^6 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Uso extenso en carteles publicitarios.  "
                                                + "\n-Punteros láseres.  "
                                                + "\n-Uso en refrigerantes para fríos extremos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Neón",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Neón.jpg"));
                                        break;   
                                        
                                        
				 case 11: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Sodio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Na"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal alcalino"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-fabricación de prductos de limpieza (lejía, jabón, etc.).  "
                                                + "\n-Fabricación de papel.  "
                                                + "\n-Fabricación de vidrio.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Sodio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Sodio.jpg"));
                                        break;
                                        
                                        
                                  case 12: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Magnesio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Mg"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de aleaciones de aluminio.  "
                                                + "\n-Polvo de talco.  "
                                                + "\n-Fabricación de antiácidos. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Magnesio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Magnesio.jpg"));
                                        break;
                                        
                                        
                                  case 13: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Aluminio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Al"
                                        +"\n           "
                                                + "\nCATEGORÍA: Otros metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 3p^1 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Esencial para muchas aleaciones de metal.  "
                                                + "\n-Fabricación de láminas, latas, material de cocina, etc.  "
                                                + "\n-Fabricación de material como: granito, arcilla, etc.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Aluminio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Aluminio.jpg"));
                                        break;
                                        
                                        
                                   case 14: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Silicio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Si "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 3p^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de semiconductores.  "
                                                + "\n-Fabricación de chips de ordenador.  "
                                                + "\n-Usado en caucho de silicona.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Silicio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Silicio.jpg"));
                                        break;
                                        
                                        
                                   case 15: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Fósforo"
                                        +"\n           "
                                                + "\nSÍMBOLO: P"
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: v3s^2 3p^3 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Ácidos. "
                                                + "\n-Detergentes.  "
                                                + "\n-Fósforos (comerciales).  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Fósforo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Fósforo.jpg"));
                                        break;
                                        
                                        
                                    case 16: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Azufre"
                                        +"\n           "
                                                + "\nSÍMBOLO: S"
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 3p^4"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de yeso.  "
                                                + "\n-Caucho.  "
                                                + "\n-Fabricación de papel.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Azufre",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Azufre.jpg"));
                                        break;
                                        
                                        
                                    case 17: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cloro"
                                        +"\n           "
                                                + "\nSÍMBOLO: Cl "
                                        +"\n           "
                                                + "\nCATEGORÍA: Halógenos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 3p^5"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Desinfectantes.  "
                                                + "\n-Aplicación en agua potable.  "
                                                + "\n-Uso en derivados de plástico PVC.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cloro",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cloro.jpg"));
                                        break;
                                        
                                        
                                     case 18: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Argón"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ar"
                                        +"\n           "
                                                + "\nCATEGORÍA: Gases nobles"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3s^2 3p^6 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Bombillás eléctricas.  "
                                                + "\n-Tubos de neón.  "
                                                + "\n-Gases para soldadura.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Argón",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Argón.jpg"));
                                        break;
                                        
                                        
                                     case 19: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Potasio"
                                        +"\n           "
                                                + "\nSÍMBOLO: K "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal alcalino"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de jabón.  "
                                                + "\n-Fertilizantes."
                                                + "\n-Pólvora.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Potasio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Potasio.jpg"));
                                        break;
                                        
                                        
                                      case 20: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Calcio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ca"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Antiácidos.  "
                                                + "\n-Fabricación de cemento.  "
                                                + "\n-Fabricación de mármol.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Calcio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Calcio.jpg"));
                                        break;
                                        
                                        
                                      case 21: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Escandio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Sc "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^1 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Elaboración de aleaciones de aluminio.  "
                                                + "\n-Fabricación de lámparas de alta intensidad. "
                                                + "\n-Catalizadores. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Escandio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Escandio.jpg"));
                                        break;
                                        
                                        
                                      case 22: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Titanio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ti "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^2 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de pintura blanca.  "
                                                + "\n- Fabricación de articulaciones artificiales.  "
                                                + "\n- Muy presente en la industria aeroespacial. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Titanio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Titanio.jpg"));
                                        break;
                                        
                                        
                                       case 23: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Vanadio"
                                        +"\n           "
                                                + "\nSÍMBOLO: V "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^3 4s^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Presente en el acero duro.  "
                                                + "\n-Estructuras para construcción.  "
                                                + "\n-Industria aeroespacial.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Vanadio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Vanadio.jpg"));
                                        break;
                                        
                                        
                                       case 24: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cromo"
                                        +"\n           "
                                                + "\nSÍMBOLO: Cr "
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^5 4s^1 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de cintas de grabación.  "
                                                + "\n-Creación de acero inoxidable. "
                                                + "\n-Pinturas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cromo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cromo.jpg"));
                                        break;
                                        
                                        
                                        case 25: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Manganeso"
                                        +"\n           "
                                                + "\nSÍMBOLO: Mn"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica:3d^5 4s^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Material para construir excavadoras.  "
                                                + "\n-Construcción de trituradoras de rocas.  "
                                                + "\n-Materiales para la agricultura (hachas, palas, etc.).  ");
                                
                                  JOptionPane.showMessageDialog(null, "Este es el elemento.", "Manganeso",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Manganeso.jpg"));
                                        break;
                                        
                                        
                                       case 26: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Hierro"
                                        +"\n           "
                                                + "\nSÍMBOLO: Fe"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^6 4s^2 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Vital en las aleaciones de acero.  "
                                                + "\n-Imanes.  "
                                                + "\n-Estructuras metálicas de todo tipo.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Hierro",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Hierro.jpg"));
                                        break;
                                        
                                        
                                       case 27: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cobalto"
                                        +"\n           "
                                                + "\nSÍMBOLO: Co"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^7 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Herramientas de corte.  "
                                                + "\n-Vidrio azul.  "
                                                + "\n-Cerámica.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cobalto",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cobalto.jpg"));
                                        break;
                                        
                                        
                                        case 28: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Níquel"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ni"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^8 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Monedas.  "
                                                + "\n-Baterías.  "
                                                + "\n-Calentadores de nicromo. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Níquel",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Níquel.jpg"));
                                        break;
                                        
                                        
                                        case 29: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cobre"
                                        +"\n           "
                                                + "\nSÍMBOLO: Cu"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Todo tipo de cables.  "
                                                + "\n-Fabricación de latón y monedas.  "
                                                + "\n-Material para conductores de calor y electricidad.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cobre",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cobre.jpg"));
                                        break;
                                        
                                        
                                        case 30: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Zinc"
                                        +"\n           "
                                                + "\nSÍMBOLO: Zn"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de acero galvanizado.  "
                                                + "\n-Lámparas.  "
                                                + "\n-Fabricación de latón.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Zinc",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Zinc.jpg"));
                                        break; 
                                        
                                        
                                        case 31: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Galio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ga"
                                        +"\n           "
                                                + "\nCATEGORÍA: Otros metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^1 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Creación de semiconductores.  "
                                                + "\n-Emisores de luces LED.  "
                                                + "\n-Láseres pequeños. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Galio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Galio.jpg"));
                                        break; 
                                        
                                        
                                         case 32: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Germanio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ge"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Transistores.  "
                                                + "\n-Ventanas infrarrojas.  "
                                                + "\n-Lentículas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Germanio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Germanio.jpg"));
                                        break;
                                        
                                        
                                         case 33: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Arsénico"
                                        +"\n           "
                                                + "\nSÍMBOLO: As"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^3 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Venenos.  "
                                                + "\n-Semiconductores eléctricos.  "
                                                + "\n-Luces de señalamiento.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Arsénico",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Arsénico.jpg"));
                                        break;
                                        
                                        
                                         case 34: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Selenio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Se "
                                        +"\n           "
                                                + "\nCATEGORÍA: No metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^4 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Usado en fotocopiadoras e impresoras láser."
                                                + "\n-Vidrio rojo.  "
                                                + "\n-Shampoo anticaspa.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Selenio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Selenio.jpg"));
                                        break; 
                                        
                                        
                                         case 35: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Bromo"
                                        +"\n           "
                                                + "\nSÍMBOLO: Br "
                                        +"\n           "
                                                + "\nCATEGORÍA: Halógenos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^5 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Aplicado en sedantes.  "
                                                + "\n-Desinfectantes para piscinas y spas.  "
                                                + "\n-Gases con plomo.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Bromo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Bromo.jpg"));
                                        break; 
                                        
                                        
                                         case 36: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Kriptón"
                                        +"\n           "
                                                + "\nSÍMBOLO: Kr "
                                        +"\n           "
                                                + "\nCATEGORÍA: Gases nobles"
                                        +"\n           "
                                                + "\nEmisión electrónica: 3d^10 4s^2 4p^6"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Lámparas de alta intensidad.  "
                                                + "\n-Tubos de neón.  "
                                                + "\n-Láseres.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Kriptón",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Kriptón.jpg"));
                                        break; 
                                        
                                        
                                         case 37: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Rubidio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Rb"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal alcalino"
                                        +"\n           "
                                                + "\nEmisión electrónica: 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Relojes atómicos.  "
                                                + "\n-Aparatos de navegación global (GPS).  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Rubidio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Rubidio.jpg"));
                                        break;
                                        
                                        
                                         case 38: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Estroncio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Sr"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                        +"\n           "
                                                + "\nEmisión electrónica: 5s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de bengalas."
                                                + "\n-Baterías nucleares. "
                                                + "\n-Fabricación de fósforos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Estroncio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Estroncio.jpg"));
                                        break; 
                                         
                                        
                                         case 39: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Itrio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Y"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^1 5s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Presente en televisiones a color.  "
                                                + "\n-Usado para superconductores de alta temperatura.  "
                                                + "\n-Fabricación de ladrillos para horno.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Itrio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Itrio.jpg"));
                                        break;
                                        
                                        
                                        
                                         case 40: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Zirconio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Zr"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^2 5s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Presente en tuberías químicas.  "
                                                + "\n-Usado en reactores nucleares.  "
                                                + "\n-Fabricación de sustancias abrasivas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Zirconio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Zirconio.jpg"));
                                        break; 
                                        
                                        
                                        
                                         case 41: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Niobio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Nb"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^4 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Vías de trenes de levitación magnética.  "
                                                + "\n-Imanes.  "
                                                + "\n-Superconductores eléctricos. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Niobio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Niobio.jpg"));
                                        break; 
                                        
                                        
                                         case 42: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Molibdeno"
                                        +"\n           "
                                                + "\nSÍMBOLO: Mo"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^5 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de placas de blindaje.  "
                                                + "\n-Fabricación de herramientas de corte.  "
                                                + "\n-Cañones de armas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Molibdeno",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Molibdeno.jpg"));
                                        break; 
                                        
                                        
                                         case 43: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Tecnecio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Tc"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^6 5s^1 "
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n- Diagnósticos del funcionamiento de órganos humanos.  "
                                                + "\n-Equilibrar equipos científicos.  "
                                                + "\n- Protege hierros y aceros al carbono de la corrisión.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Tecnecio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Tecnecio.jpg"));
                                        break; 
                                        
                                        
                                         case 44: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Rutenio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ru"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^7 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Muy utilizado en la producción de hidrógeno.  "
                                                + "\n-Presente en catalizadores.  "
                                                + "\n-Usado en interruptores de hoja.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Rutenio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Rutenio.jpg"));
                                        break; 
                                        
                                        
                                         case 45: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Rodio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Rh"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^8 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Usado en controladores de contaminación. "
                                                + "\n-Presente en diversos materiales de laboratorio. "
                                                + "\n-Reflectores.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Rodio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Rodio.jpg"));
                                        break; 
                                        
                                        
                                         case 46: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Paladio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Pd"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Tecnología de odontología.  "
                                                + "\n-Contactos eléctricos.  "
                                                + "\n-Controladores de contaminación.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Paladio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Paladio.jpg"));
                                        break; 
                                        
                                        
                                         case 47: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Plata"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ag"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Usado como el mejor conductor de electricidad.  "
                                                + "\n-Para acuñar monedas.  "
                                                + "\n-Fabricación de películas fotográficas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Plata",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Plata.jpg"));
                                        break; 
                                        
                                        
                                         case 48: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cadmio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Cd"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metales de transición"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Pilas de NiCd.  "
                                                + "\n-Fabricación de pinturas roja y amarilla. "
                                                + "\n-Rociadores contra incendios.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cadmio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cadmio.jpg"));
                                        break; 
                                        
                                        
                                         case 49: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Indio"
                                        +"\n           "
                                                + "\nSÍMBOLO: In"
                                        +"\n           "
                                                + "\nCATEGORÍA: Otros metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Revestimientos de vidrio.  "
                                                + "\n-Pantallas de cristal líquido (LCD).  "
                                                + "\n- Soldaduras. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Indio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Indio.jpg"));
                                        break; 
                                        
                                        
                                         case 50: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Estaño"
                                        +"\n           "
                                                + "\nSÍMBOLO: Sn"
                                        +"\n           "
                                                + "\nCATEGORÍA: Otros metales"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de bronce.  "
                                                + "\n-Fabricación de vidrio. "
                                                + "\n-Vasos de peltre.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Estaño",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Estaño.jpg"));
                                        break; 
                                        
                                        
                                         case 51: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Antimonio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Sb"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^3"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Endurecedores de plomo.  "
                                                + "\n-Presente en balas.  "
                                                + "\n-Retardantes de llama. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Antimonio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Antimonio.jpg"));
                                        break; 
                                        
                                        
                                         case 52: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Telurio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Te"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metaloides"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^4"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Muy utilizado en aleaciones. "
                                                + "\n-Fabricación de CD´s.  "
                                                + "\n-Generadores termoeléctricos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Telurio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Telurio.jpg"));
                                        break; 
                                        
                                        
                                         case 53: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Yodo"
                                        +"\n           "
                                                + "\nSÍMBOLO: I"
                                        +"\n           "
                                                + "\nCATEGORÍA: Halógenos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^5"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Desinfectante para heridas.  "
                                                + "\n-Tratamiento del agua potable.  "
                                                + "\n-Prevenir enfermedades de la tiroides. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Yodo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Yodo.jpg"));
                                        break; 
                                        
                                        
                                         case 54: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Xenón"
                                        +"\n           "
                                                + "\nSÍMBOLO: Xe"
                                        +"\n           "
                                                + "\nCATEGORÍA: Gases nobles"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4d^10 5s^2 5p^6"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Lámparas de alta intensidad.  "
                                                + "\n-Proyectores de video.  "
                                                + "\n-Motores iónicos para naves espaciales.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Xenón",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Xenón.jpg"));
                                        break; 
                                        
                                        
                                         case 55: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cesio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Cs"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal alcalino"
                                        +"\n           "
                                                + "\nEmisión electrónica: 6s^1"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Relojes atómicos.  "
                                                + "\n-Navegación global (GPS).  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cesio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cesio.jpg"));
                                        break; 
                                        
                                        
                                         case 56: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Bario"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ba"
                                        +"\n           "
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                        +"\n           "
                                                + "\nEmisión electrónica: 6s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fluoroscopia.  "
                                                + "\n-Fuegos artificiales.  "
                                                + "\n-Blanqueador. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Bario",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Bario.jpg"));
                                        break; 
                                        
                                        
                                         case 57: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Lantano"
                                        +"\n           "
                                                + "\nSÍMBOLO: La"
                                        +"\n           "
                                                + "\nCATEGORÍA: Lantánidos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 5d^1 6s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de vidrio óptico.  "
                                                + "\n-Lentes de telescopio. "
                                                + "\n-Lentes de cámara.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Lantano",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Lantano.jpg"));
                                        break;
                                        
                                        
                                         case 58: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Cerio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Ce"
                                        +"\n           "
                                                + "\nCATEGORÍA: Lantánidos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4f^1 5d^1 6s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Pedernales.  "
                                                + "\n-Lámparas de arco.  "
                                                + "\n-Hornos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Cerio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Cerio.jpg"));
                                        break; 
                                        
                                        
                                         case 59: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Praseodimio"
                                        +"\n           "
                                                + "\nSÍMBOLO: Pr"
                                        +"\n           "
                                                + "\nCATEGORÍA: Lantánidos"
                                        +"\n           "
                                                + "\nEmisión electrónica: 4f^3 6s^2"
                                        +"\n           "
                                                + "\nUsos tecnológicos: \n-Fabricación de gafas protectoras.  "
                                                + "\n-Vidrio amarillo.  "
                                                + "\n-Imanes. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Praseodimio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Praseodimio.jpg"));
                                        break; 
                                        
                                        
                                         case 60: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Neodimio"
                                                + "\nSÍMBOLO: Nd"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^4 6s^2"
                                                + "\nUsos tecnológicos: \n-Muy usado para imanes fuertes.  "
                                                + "\n-Motores eléctricos de todo tipo.  "
                                                + "\n-Altavoces y auriculares.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Neodimio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Neodimio.jpg"));
                                        break;
                                        
                                        
                                         case 61: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Prometio"
                                                + "\nSÍMBOLO: Pm"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^5 6s^2"
                                                + "\nUsos tecnológicos:\n- N/A  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Prometio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Prometio.jpg"));
                                        break; 
                                        
                                        
                                         case 62: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Samario"
                                                + "\nSÍMBOLO: Sm"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^6 6s^2"
                                                + "\nUsos tecnológicos: \n-Imanes.  "
                                                + "\n-Algunos motores eléctricos.  "
                                                + "\n-Vidrios absorbentes de infrarrojos.  ");
                                
                               JOptionPane.showMessageDialog(null, "Este es el elemento.", "Samario",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Samario.jpg"));
                                        break;
                                        
                                        
                                         case 63: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Europio"
                                                + "\nSÍMBOLO: Eu"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^7 6s^2"
                                                + "\nUsos tecnológicos: \n-Televisiones a color.  "
                                                + "\n-Lámparas fluorescenetes tricromáticas.  "
                                                + "\n-Láseres.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Europio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Europio.jpg"));
                                        break; 
                                        
                                        
                                         case 64: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Gadolinio"
                                                + "\nSÍMBOLO: Gd"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^7 5d^1 6s^2"
                                                + "\nUsos tecnológicos: \n-Usado como el mejor absorbente de neutrones.  "
                                                + "\n-Resonancia magnética.  "
                                                + "\n-Radiografía con neutrones. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Gadolinio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Gadolinio.jpg"));
                                        break; 
                                        
                                        
                                         case 65: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Terbio"
                                                + "\nSÍMBOLO: Tb"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^9 6s^2"
                                                + "\nUsos tecnológicos: \n-Materiales magnetostrictivos.  "
                                                + "\n-Terfenol-D.  "
                                                + "\n-CD´s para ordenador.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Terbio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Terbio.jpg"));
                                        break;
                                        
                                        
                                         case 66: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Disprosio"
                                                + "\nSÍMBOLO: Dy"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^10 6s^2"
                                                + "\nUsos tecnológicos: \n-Barras de control nuclear.  "
                                                + "\n-Terfenol-D.  "
                                                + "\n-Fósforos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Disprosio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Disprosio.jpg"));
                                        break; 
                                        
                                        
                                         case 67: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Holmio"
                                                + "\nSÍMBOLO: Ho"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^11 6s^2"
                                                + "\nUsos tecnológicos: \n-Cirugía láser.  "
                                                + "\n-Filtros de vidrio amarillo.  "
                                                + "\n-Láseres infrarrojos.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Holmio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Holmio.jpg"));
                                        break; 
                                        
                                        
                                         case 68: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Erbio"
                                                + "\nSÍMBOLO: Er"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^12 6s^2"
                                                + "\nUsos tecnológicos: \n-Amplificadores de señal de fibra óptica.  "
                                                + "\n-Vidrio rosa.  "
                                                + "\n-Gafas de sol. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Erbio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Erbio.jpg"));
                                        break;
                                        
                                        
                                         case 69: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Tulio"
                                                + "\nSÍMBOLO: Tm"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^13 6s^2"
                                                + "\nUsos tecnológicos: \n-Fabricación de láseres infrarrojos.  "
                                                + "\n-Presente en fósforos. "
                                                + "\n-Cirugía láser.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Tulio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Tulio.jpg"));
                                        break; 
                                        
                                        
                                         case 70: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Iterbio"
                                                + "\nSÍMBOLO: Yb"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^14 6s^2"
                                                + "\nUsos tecnológicos: \n-Aleaciones de acero inoxidable.  "
                                                + "\n-Amplificadores de señal de fibra óptica."
                                                + "\n-Láseres de fibra infrarroja.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Iterbio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Iterbio.jpg"));
                                        break; 
                                        
                                        
                                         case 71: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Lutecio"
                                                + "\nSÍMBOLO: Lu"
                                                + "\nCATEGORÍA: Lantánidos"
                                                + "\nEmisión electrónica: 4f^10 5d^1 6s^2"
                                                + "\nUsos tecnológicos: \n-Muy usado en terapia fotodinámica para"
                                        + "combatir el cáncer.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Lutecio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Lutecio.jpg"));
                                        break; 
                                        
                                        
                                         case 72: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Hafnio"
                                                + "\nSÍMBOLO: Hf "
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^2 6s^2"
                                                + "\nUsos tecnológicos: \n-Barras de control nucleares en submarinos.  "
                                                + "\n-Electrodos de plasma.  "
                                                + "\n-Usado para absorber neutrones.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Hafnio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Hafnio.jpg"));
                                        break; 
                                        
                                        
                                         case 73: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Tantalio"
                                                + "\nSÍMBOLO: Ta"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^3 6s^2"
                                                + "\nUsos tecnológicos: \n-Muy utilizado en la fabricación de material de laboratorio.  "
                                                + "\n-Teléfonos móviles.  "
                                                + "\n-Articulaciones artificiales. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Tantalio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Tantalio.jpg"));
                                        break; 
                                        
                                        
                                         case 74: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Volframio"
                                                + "\nSÍMBOLO: W"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^4 6s^2"
                                                + "\nUsos tecnológicos: \n-Fabricación de filamentos de lámparas.s  "
                                                + "\n-Herramientas de corte.  "
                                                + "\n-Termopares. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Volframio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Volframio.jpg"));
                                        break; 
                                        
                                        
                                         case 75: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Renio"
                                                + "\nSÍMBOLO: Re"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^5 6s^2"
                                                + "\nUsos tecnológicos: \n-Fabricación de cohetes espaciales.  "
                                                + "\n-Bobinas de calefacción.  "
                                                + "\n-Filamentos de laboratorio.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Renio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Renio.jpg"));
                                        break; 
                                        
                                        
                                         case 76: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Osmio"
                                                + "\nSÍMBOLO: Os"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^6 6s^2"
                                                + "\nUsos tecnológicos: \n-Perfecto para fabricar contactos eléctricos.  "
                                                + "\n-Polvo para huellas dactilares.  "
                                                + "\n-Agujas.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Osmio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Osmio.jpg"));
                                        break; 
                                        
                                        
                                         case 77: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Iridio"
                                                + "\nSÍMBOLO: Ir "
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^6 6s^2"
                                                + "\nUsos tecnológicos: \n-Bujías para motores.  "
                                                + "\n-Puntas de bolígrafo.  "
                                                + "\n-Agujas de todo tipo.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Iridio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Iridio.jpg"));
                                        break; 
                                        
                                        
                                         case 78: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Platino"
                                                + "\nSÍMBOLO: Pt"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^9 6s^1"
                                                + "\nUsos tecnológicos: \n-Proceso de craqueo de petróleo.  "
                                                + "\n-Procesamiento de grasas vegetales y animales.  "
                                                + "\n-Catalizadores de todo tipo.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Platino",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Platino.jpg"));
                                        break; 
                                        
                                        
                                         case 79: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Oro"
                                                + "\nSÍMBOLO: Au"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^1"
                                                + "\nUsos tecnológicos: \n-Fabricación de contactos eléctricos de alta calidad.  "
                                                + "\n-Para acuñar monedas.  "
                                                + "\n-Creación de joyería única.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Oro",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Oro.jpg"));
                                        break; 
                                        
                                        
                                         case 80: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Mercurio"
                                                + "\nSÍMBOLO: Hg"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^1"
                                                + "\nUsos tecnológicos: \n-Fabricación de termómetros.  "
                                                + "\n-Herramientas de odontología. "
                                                + "\n-Barómetros y termostatos. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Mercurio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Mercurio.jpg"));
                                        break; 
                                        
                                        
                                         case 81: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Talio"
                                                + "\nSÍMBOLO: Tl"
                                                + "\nCATEGORÍA: Otros metales"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^1"
                                                + "\nUsos tecnológicos: \n-Utilizado en aleaciones de mercurio.  "
                                                + "\n-Lámparas submarinas.  "
                                                + "\n-Termómetros de baja temperatura.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Talio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Talio.jpg"));
                                        break; 
                                        
                                        
                                         case 82: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Plomo"
                                                + "\nSÍMBOLO: Pb"
                                                + "\nCATEGORÍA: Otros metales"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^2"
                                                + "\nUsos tecnológicos: \n-Fabricación de pesos.  "
                                                + "\n-Diferentes tipos de balas.  "
                                                + "\n-Escudos para la radiación.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Plomo",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Plomo.jpg"));
                                        break; 
                                        
                                        
                                         case 83: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Bismuto"
                                                + "\nSÍMBOLO: Bi"
                                                + "\nCATEGORÍA: Otros metales"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^3"
                                                + "\nUsos tecnológicos: \n-Muy usado para la fabricación de soldaduras. "
                                                + "\n-Fusibles para sistemas eléctricos. "
                                                + "\n-Rociadores contra incendios.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Bismuto",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Bismuto.jpg"));
                                        break; 
                                        
                                        
                                         case 84: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Polonio"
                                                + "\nSÍMBOLO: Po"
                                                + "\nCATEGORÍA: Metaloides"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^4"
                                                + "\nUsos tecnológicos: \n-Cepillos antiestáticos.  "
                                                + "\n-Composición del tabaco. "
                                                + "\n-Usos de su alta radiactividad.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Polonio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Polonio.jpg"));
                                        break; 
                                        
                                        
                                         case 85: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Astato"
                                                + "\nSÍMBOLO: At"
                                                + "\nCATEGORÍA: Halógenos"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^5"
                                                + "\nUsos tecnológicos: \n-Muy usado en la medicina contra el cáncer.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Astato",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Astato.jpg"));
                                        break; 
                                        
                                        
                                         case 86: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Radón"
                                                + "\nSÍMBOLO: Rn"
                                                + "\nCATEGORÍA: Gases nobles"
                                                + "\nEmisión electrónica: 4f^14 5d^10 6s^2 6p^6"
                                                + "\nUsos tecnológicos: \n-Implantes quirúrgicos para tratar el cáncer. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Radón",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Radón.jpg"));
                                        break; 
                                        
                                        
                                         case 87: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Francio"
                                                + "\nSÍMBOLO: Fr"
                                                + "\nCATEGORÍA: Metal alcalino"
                                                + "\nEmisión electrónica: 7s^1"
                                                + "\nUsos tecnológicos: \n-Trampas láser para átomos.");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Francio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Francio.jpg"));
                                        break; 
                                        
                                        
                                         case 88: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Radio"
                                                + "\nSÍMBOLO: Ra"
                                                + "\nCATEGORÍA: Metal de tierra alcalina"
                                                + "\nEmisión electrónica: 7s^2"
                                                + "\nUsos tecnológicos: \n-Radiografías.  "
                                                + "\n-Producción médica de radón.  "
                                                + "\n-Relojes luminosos (actualmente prohibidos).  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Radio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Radio.jpg"));
                                        break;
                                        
                                        
                                        
                                         case 89: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Actinio"
                                                + "\nSÍMBOLO: Ac"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-Muy usado en medicina contra el cáncer.  "
                                                + "\n-Usado como gran fuente de neutrones.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Actinio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Actinio.jpg"));
                                        break; 
                                        
                                        
                                         case 90: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Torio"
                                                + "\nSÍMBOLO: Th "
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 6d^2 7s^2"
                                                + "\nUsos tecnológicos: \n-Muy usado como combustible de reactores nucleares. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Torio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Torio.jpg"));
                                        break; 
                                        
                                        
                                         case 91: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Protactinio"
                                                + "\nSÍMBOLO: Pa "
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^2 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-N/A  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Protactinio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Protactinio.jpg"));
                                        break; 
                                        
                                        
                                         case 92: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Uranio"
                                                + "\nSÍMBOLO: U"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^3 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-Armas nucleares. "
                                                + "\n-Contrapesos.  "
                                                + "\n-Balas perforantes.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Uranio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Uranio.jpg"));
                                        break; 
                                        
                                        
                                         case 93: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Neptunio"
                                                + "\nSÍMBOLO: Np"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^4 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-Detectores de neutrones. "
                                                + "\n-Armas nucleares.  "
                                                + "\n-Dosímetros.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Neptunio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Neptunio.jpg"));
                                        break; 
                                        
                                        
                                         case 94: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Plutonio"
                                                + "\nSÍMBOLO: Pu"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^6 7s^2"
                                                + "\nUsos tecnológicos: \n-Combustible de reactores nucleares.  "
                                                + "\n-Combustible de naves espaciales.  "
                                                + "\n-Armamento nuclear.  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Plutonio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Plutonio.jpg"));
                                        break; 
                                        
                                        
                                         case 95: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Americio"
                                                + "\nSÍMBOLO: Am"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^7 7s^2"
                                                + "\nUsos tecnológicos: \n-Detectores de humo.  "
                                                + "\n-Medidores de espesor de lámina. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Americio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Americio.jpg"));
                                        break; 
                                        
                                        
                                         case 96: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Curio"
                                                + "\nSÍMBOLO: Cm"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^7 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-Instrumentos científicos.  "
                                                + "\n-Analizadores de minerales. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Curio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Curio.jpg"));
                                        break; 
                                        
                                        
                                         case 97: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Berkelio"
                                                + "\nSÍMBOLO: Bk"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^9 7s^2"
                                                + "\nUsos tecnológicos: \n-N/A  ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Berkelio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Berkelio.jpg"));
                                        break; 
                                        
                                        
                                         case 98: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Californio"
                                                + "\nSÍMBOLO: Cf"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^10 7s^2"
                                                + "\nUsos tecnológicos: \n-Instrumentos científicos.  "
                                                + "\n- Analizadores de minerales. ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Californio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Californio.jpg"));
                                        break; 
                                        
                                        
                                         case 99: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Einstenio"
                                                + "\nSÍMBOLO: Es"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^11 7s^2 "
                                                + "\nUsos tecnológicos: \n-N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Einstenio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Einstenio.jpg"));
                                        break; 
                                        
                                        
                                         case 100: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Fermio"
                                                + "\nSÍMBOLO: Fm "
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^12 7s^2"
                                                + "\nUsos tecnológicos: \n-N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Fermio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Fermio.jpg"));
                                        break; 
                                        
                                        
                                         case 101: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Mendelevio"
                                                + "\nSÍMBOLO: Md"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^13 7s^2"
                                                + "\nUsos tecnológicos: \n-N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Mendelevio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Mendelevio.jpg"));
                                        break; 
                                        
                                        
                                         case 102: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Nobelio"
                                                + "\nSÍMBOLO: No"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^14 7s^2 "
                                                + "\nUsos tecnológicos: \n-N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Nobelio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Nobelio.jpg"));
                                        break; 
                                        
                                        
                                         case 103: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO:Laurencio"
                                                + "\nSÍMBOLO: Lr"
                                                + "\nCATEGORÍA: Actínidos"
                                                + "\nEmisión electrónica: 5f^14 6d^1 7s^2"
                                                + "\nUsos tecnológicos: \n-N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Laurencio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Laurencio.jpg"));
                                        break;
                                        
                                        
                                        case 104: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Rutherfordio"
                                                + "\nSÍMBOLO: Rf"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^2 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Rutherfordio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Rutherfordio.jpg"));
                                        break; 
                                        
                                        
                                        case 105: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Dubnio"
                                                + "\nSÍMBOLO: Db"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^3 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Dubnio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Dubnio.jpg"));
                                        break; 
                                        
                                        
                                        case 106: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Seaborgio"
                                                + "\nSÍMBOLO: Sg"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^4 7s^2"
                                                + "\nUsos tecnológicos: N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Seaborgio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Seaborgio.jpg"));
                                        break;
                                        
                                        
                                        case 107: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Bohrio"
                                                + "\nSÍMBOLO: Bh"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^5 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Bohrio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Bohrio.jpg"));
                                        break;
                                        
                                        
                                        case 108: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Hassio"
                                                + "\nSÍMBOLO: Hs"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^6 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Hassio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Hassio.jpg"));
                                        break;
                                        
                                        
                                       case 109: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Meitnerio"
                                                + "\nSÍMBOLO: Mt"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^7 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Meitnerio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Meitnerio.jpg"));
                                        break;
                                        
                                        
                                       case 110: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Darmstadtio"
                                                + "\nSÍMBOLO: Ds "
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^8 7s^2 "
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Darmstadtio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Darmstadtio.jpg"));
                                        break; 
                                        
                                        
                                       case 111: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Roentgenio"
                                                + "\nSÍMBOLO: Rg"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^1"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Roentgenio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Roentgenio.jpg"));
                                        break;
                                        
                                        
                                       case 112: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Copernicio"
                                                + "\nSÍMBOLO: Cn"
                                                + "\nCATEGORÍA: Metales de transición"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Copernicio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Copernicio.jpg"));
                                        break;
                                        
                                        
                                       case 113: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Nihonium"
                                                + "\nSÍMBOLO: Nh"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^1"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Nihonium",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Nihonio.jpg"));
                                        break;
                                        
                                        
                                      case 114: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Flerovio"
                                                + "\nSÍMBOLO: Fl"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^2"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Flerovio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Flerovio.jpg"));
                                        break;
                                        
                                        
                                      case 115: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Moscovium"
                                                + "\nSÍMBOLO: Mc"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^3"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Moscovium",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Moscovium.jpg"));
                                        break; 
                                        
                                        
                                      case 116: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Livermorio"
                                                + "\nSÍMBOLO: Lv"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^4"
                                                + "\nUsos tecnológicos: N/A ");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Livermorio",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Livermorio.jpg"));
                                        break;
                                        
                                        
                                     case 117: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Tennessine"
                                                + "\nSÍMBOLO: Ts"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^5"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Tennessine",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Tennessine.jpg"));
                                        break;
                                        
                                        
                                     case 118: 
				JOptionPane.showMessageDialog(null,"\nNOMBRE DEL ELEMENTO: Oganesson"
                                                + "\nSÍMBOLO: Og"
                                                + "\nCATEGORÍA: Propiedades químicas desconocidas"
                                                + "\nEmisión electrónica: 5f^14 6d^10 7s^2 7p^6"
                                                + "\nUsos tecnológicos: N/A");
                                
                                JOptionPane.showMessageDialog(null, "Este es el elemento.", "Oganesson",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Oganesson.jpg"));
                                        break;
                   
		        
                                     case 0: 
					JOptionPane.showMessageDialog(null,"Consulta finalizada.", "Fin del programa",
                                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Finalizado.jpg"));
                                        
                                        JOptionPane.showMessageDialog(null,"Saludos al profe Dionisio.", "Lo extrañamos profe :(",
                                        JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Saludos.jpg"));
                                        
                                           JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!", "Química U1",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Despedida.jpg"));
					break;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido","¿?",
                                                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Nop.jpg"));
                                                break;
				}
					
				
					
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Dato introducido no válido","Error",
                                       JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/jazminquimica/Mal.jpg"));
			}
		}
	}

		
}

