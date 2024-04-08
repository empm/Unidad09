/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionPacientesVer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Roger Sancho
 * @fecha 22 mar 2023 18:04:53
 * @company Ciclo Superior de Informática
 * @version Sin información de la versión
 */
public class Archivador_MainMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<FichaPaciente> archivador = new ArrayList<>();

        int accion = 1;
        int posicion;
        FichaPaciente paciente;
        boolean error;

        //Inicio del Programa
        while (accion != 0) {
            error = true;
            System.out.println("-------------------------------");
            System.out.println("Archivador de Pacientes del Hospital Peset. ¿Qué desea hacer?");
            System.out.println("[1: Listar Pacientes, 2: Añadir, 3: Insertar, 4: Modificar, 5: Borrar, 6: Buscar, 7: Ordenar, 0: Salir del Programa]");

            try {
                accion = sc.nextInt();
                if (accion < 0 || accion > 7) {
                    Exception ex = new Exception();
                    throw ex;
                }
            } catch (Exception ex) {
                System.out.println("Código de acción erroneo. Intentelo otra vez.\n");
                sc.nextLine();
            }

            switch (accion) {
                case 0: {
                    System.out.println("-------------------------------");
                    System.out.println("Saliendo del programa.");
                    System.out.println("-------------------------------");
                }
                break;
                case 1: {
                    System.out.println("-------------------------------");
                    System.out.println("Listado Pacientes");
                    System.out.println("-------------------------------");
                    if (archivador.isEmpty()) {
                        System.out.println("Todavía no existen pacientes.\n");
                    } else {
                        System.out.println(listar(archivador));
                    }
                }
                break;
                case 2: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Añadiendo Paciente:");
                        System.out.println("-------------------------------");
                        try {
                            paciente = insertarDatosP(true);
                            archivador.add(paciente);
                            error = false;
                        } catch (Exception ex) {
                            System.out.println("Error en el proceso. Intentelo otra vez.\n");
                        }
                    }
                }
                break;
                case 3: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Insertando Paciente:");
                        System.out.println("-------------------------------");
                        try {
                            System.out.println("Posición para insertar el paciente:");
                            posicion = sc.nextInt();
                            paciente = insertarDatosP(true);
                            archivador.add(posicion, paciente);
                            error = false;
                        } catch (IndexOutOfBoundsException ex) {
                            System.out.println("Esa posición no existe dentro de la lista.\n");
                        } catch (Exception ex) {
                            System.out.println("Error en el proceso. Intentelo otra vez.\n");
                        }
                    }
                }
                break;
                case 4: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Modificando Paciente:");
                        System.out.println("-------------------------------");
                        try {
                            System.out.println("Posición para modificar el paciente:");
                            posicion = sc.nextInt();
                            paciente = insertarDatosP(true);
                            archivador.set(posicion, paciente);
                            error = false;
                        } catch (IndexOutOfBoundsException ex) {
                            System.out.println("Esa posición no existe dentro de la lista.\n");
                        } catch (Exception ex) {
                            System.out.println("Error en el proceso. Intentelo otra vez.\n");
                        }
                    }
                }
                break;
                case 5: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Borrando Paciente:");
                        System.out.println("-------------------------------");
                        try {
                            System.out.println("Posición del paciente que se borrará:");
                            posicion = sc.nextInt();
                            paciente = archivador.get(posicion);
                            System.out.println("¿Seguro que quieres borrar el paciente: " + paciente);
                            System.out.println("1: Si, 0: No");
                            int borrar = sc.nextInt();
                            switch (borrar) {
                                case 0: {
                                    System.out.println("No se ha borrado el paciente");
                                    error = false;
                                }
                                break;
                                case 1: {
                                    System.out.println("Se borra el paciente de la posición: " + posicion);
                                    archivador.remove(posicion);
                                    error = false;
                                }
                                break;
                                default: {
                                    System.out.println("No se ha escogido opción valida, no se ha realizado la acción.");
                                    error = false;
                                }
                            }
                        } catch (IndexOutOfBoundsException ex) {
                            System.out.println("Esa posición no existe dentro de la lista.\n");
                        } catch (Exception ex) {
                            System.out.println("Error en el proceso. Intentelo otra vez.\n");
                        }
                    }
                }
                break;
                case 6: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Buscando Paciente:");
                        System.out.println("-------------------------------");
                        try {
                            paciente = insertarDatosP(false);
                            posicion = archivador.indexOf(paciente);
                            if (posicion == -1) {
                                System.out.println("No se ha encontrado el paciente.");
                            } else {
                                System.out.println("El/la paciente: "+archivador.get(posicion)+" se encuentra en la posición " + posicion + " del archivador.");
                            }
                            error = false;
                        } catch (Exception ex) {
                            System.out.println("Error en el proceso. Intentelo otra vez.\n");
                        }
                    }
                }
                break;
                case 7: {
                    while (error) {
                        System.out.println("-------------------------------");
                        System.out.println("Ordenando Listado de Pacientes:");
                        System.out.println("-------------------------------");
                        int ordenar = 0;
                        try {
                            System.out.println("¿Cómo quieres ordenar el listado de Pacientes?");
                            System.out.println("Nombre: 1, Apellidos: 2, Edad: 3, No Ordenar: 0.");
                            ordenar = sc.nextInt();
                            if (ordenar < 0 || ordenar > 3) {
                                Exception ex = new Exception();
                                throw ex;
                            }
                        } catch (Exception ex) {
                            System.out.println("Código de acción erroneo. Intentelo otra vez.\n");
                            sc.nextLine();
                        }
                        switch (ordenar) {
                            case 0: {
                                System.out.println("No se han ordenado los Pacientes");
                                error = false;
                            }
                            break;
                            case 1: {
                                Collections.sort(archivador, new ComparadorPacientes_Nombre());
                                System.out.println("Se han ordenado los Pacientes por Nombre.");
                                error = false;
                            }
                            break;
                            case 2: {
                                Collections.sort(archivador, new ComparadorPacientes_Apellidos());
                                System.out.println("Se han ordenado los Pacientes por Apellidos.");
                                error = false;
                            }
                            break;
                            case 3: {
                                Collections.sort(archivador, new ComparadorPacientes_Edad());
                                System.out.println("Se han ordenado los Pacientes por Edad.");
                                error = false;
                            }
                            break;
                        }

                    }
                }
                break;

            }
        }
    }

    public static String listar(ArrayList<FichaPaciente> archivador) {
        String cadena = "";
        cadena += "";
        for (int i = 0; i < archivador.size(); i++) {
            cadena += archivador.get(i) + "\n";
        }
        cadena += "------------------------------------------------";
        return cadena;
    }

    public static FichaPaciente insertarDatosP(boolean preguntarEdad) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombreP;
        String apellidosP;
        int edadP = 0;
        FichaPaciente paciente;

        System.out.println("Inserte los datos del paciente:");
        System.out.println("Nombre:");
        nombreP = sc.nextLine();
        System.out.println("Apellidos:");
        apellidosP = sc.nextLine();
        if (preguntarEdad) {
            System.out.println("Edad:");
            boolean leido = false;
            do {
                try {
                    edadP = sc.nextInt();
                    leido = true;
                } catch (InputMismatchException ex) {
                    sc.nextLine();
                    System.out.println("Edad erronea, vuelve a introducirla:");
                }
            } while (!leido);
        }

        paciente = new FichaPaciente(nombreP, apellidosP, edadP);

        return paciente;
    }

}
