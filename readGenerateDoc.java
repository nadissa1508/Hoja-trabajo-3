/**
 * Universidad del Valle de Guatemala
 * @author Isabella Obando Guzman, 23074
 * @author Angie Nadissa Vela López, 23764
 * @description clase que genera 3000 números aleatorios y los guarda en un archivo txt
 * @date creación 23/01/2024 última modificación 30/01/2024
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class readGenerateDoc{

    //devuelve del txt la cantidad de numeros que se pidan
    public int[] readRandomNumbers(String fileName, int cant){
        int[] randomNumbers = new int[cant];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linea = reader.readLine();
            String[] numerosString = linea.split(",");

            for (int i = 0; i < cant; i++) {
                randomNumbers[i] = Integer.parseInt(numerosString[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return randomNumbers;

    }

    // los parametros deben ser "numeros.txt", 3000, 0, 8000

    //crea el txt con 3000 numeros aleatorios
    public void generateRandomNumbers(String fileName, int cant, int minimum, int maximum) {
        //este archivo se debe crear una única vez
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Random random = new Random();

            for (int i = 0; i < cant; i++) {
                int randomNumber = random.nextInt(maximum - minimum + 1) + minimum;
                writer.write(Integer.toString(randomNumber));

                if (i < cant - 1) {
                    // Separar los números por comas, excepto el último
                    writer.write(",");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}