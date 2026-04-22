import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        float calificacion, promedio=0;
        int opMenu=0, edad, materias;
        Carrera carrera1= new Carrera("Ingeniería en Sistemas", 10);
        Scanner scan = new Scanner (System.in);
        String nombre, apellido, codigoMat, nombreMat, nombreEst, documento;

        do {

            System.out.println("\nMENU PRINCIPAL\n1- Agregar Estudiante a Ing. en Sistemas\n2- Asignar Materia\n3- Mostrar Promedios\n4- Listar Estudiantes\n5- Salir\nSu Opcion --> ");
            opMenu=scan.nextInt();
            while (opMenu<1||opMenu>5) {
                System.out.println("Opcion Inválida. Seleccione Nuevamente.\nSu Opcion --> ");
                opMenu=scan.nextInt();
            }
            scan.nextLine();
            switch (opMenu) {
                case 1: // INSERTAR ESTUDIANTE A LA CARRERA - Se inserta de a UN estudiante por vez
                    System.out.println("Ingrese los datos del nuevo estudiante:");
                    System.out.println("- Nombre: ");
                    nombreEst=scan.nextLine();
                    System.out.println("- Apellido: ");
                    apellido=scan.nextLine();
                    System.out.println("- Edad: ");
                    edad=scan.nextInt();
                    scan.nextLine();
                    System.out.println("- Documento: ");
                    documento=scan.nextLine();
                    System.out.println("- Cantidad de Materias a Cursar: ");
                    materias=scan.nextInt();
                    scan.nextLine();
                    Estudiante nuevo = new Estudiante(nombreEst, apellido, edad, "Ingeniería en Sistemas", 0f, materias, documento);
                    carrera1.agregarEstudiante(nuevo);
                    System.out.println("Estudiante Agregado.\n");
                    break;
                case 2: // ASIGNAR MATERIA A ESTUDIANTE
                    
                    System.out.println("Nombre del Estudiante al que se le asigna: ");
                    nombre=scan.nextLine();
                    Estudiante alumno = carrera1.obtenerEstudiante(nombre);

                    if(alumno!=null){
                        System.out.println("Ingrese los datos de la Materia: ");
                        System.out.println("- Nombre Materia: ");
                        nombreMat=scan.nextLine();
                        System.out.println("- Codigo: ");
                        codigoMat=scan.nextLine();
                        System.out.println("- Calificacion: ");
                        calificacion=scan.nextFloat();
                        scan.nextLine();
                        Materia materia1 = new Materia (nombreMat, codigoMat, 20, calificacion);
                        alumno.agregarMateria(materia1);
                        System.out.println("Alumno encontrado, Materia Asignada.");
                    } else {
                        System.out.println("Alumno Inexistente, no se puede asignar la materia.\n");
                    }
                    break;
                case 3: // CALCULAR Y MOSTRAR PROMEDIOS
                    System.out.println("PROMEDIOS DE LA CARRERA");
                    Estudiante[] listaEstudiantes = carrera1.getEstudiantes();

                    for (int i=0; i<listaEstudiantes.length; i++) {
                        promedio=0;
                        if (listaEstudiantes[i]!=null) {
                            promedio=listaEstudiantes[i].calcularPromedio();
                            System.out.println("\n- " + listaEstudiantes[i].getNombre() + " " + listaEstudiantes[i].getApellido() +": " + promedio);
                        }
                    }
                    break;
                case 4: // LISTAR ESTUDIANTES
                    System.out.println("LISTADO DE ALUMNOS: ");
                    carrera1.listarEstudiantes();
                    break;
                case 5: System.out.println("Saliendo....\n");
                    break;
                default: System.out.println("ERROR\n");
                    break;
            }

        } while (opMenu!=5);
        
        scan.close();

    }
}
