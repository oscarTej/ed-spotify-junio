package com.iesam.edspotify.usuario.data.local;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.edspotify.usuario.data.local.



public class UsuarioFileLocalDataSource {





        private String nameFile = "demo.txt";

        private Gson gson = new Gson();

        private final Type typeList = new TypeToken<ArrayList<Usuario>>() {
        }.getType();

        public void save(Usuario model) {
            List<Usuario> models = findAll();
            models.add(model);
            saveToFile(models);
        }

        public void saveList(List<Usuario> models) {
            saveToFile(models);
        }

        private void saveToFile(List<Usuario> models) {
            try {
                FileWriter myWriter = new FileWriter(nameFile);
                myWriter.write(gson.toJson(models));
                myWriter.close();
                System.out.println("Datos guardados correctamente");
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al guardar la informaciÃ³n.");
                e.printStackTrace();
            }
        }

        public Usuario findById(String id) {
            List<Usuario> models = findAll();
            for (Usuario model : models) {
                if (Objects.equals(model.getId(), id)) {
                    return model;
                }
            }
            return null;
        }

        public List<Usuario> findAll() {
            try {
                File myObj = new File(nameFile);
                if (!myObj.exists()) {
                    myObj.createNewFile();
                }
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    myReader.close();
                    return gson.fromJson(data, typeList);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("Ha ocurrido un error al obtener el listado.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error al crear el fichero.");
                throw new RuntimeException(e);
            }
            return new ArrayList<>();
        }

        public void delete(String modelId) {
            List<Usuario> newList = new ArrayList<>();
            List<Usuario> models = findAll();
            for (Usuario model : models) {
                if (model.getId() != modelId) {
                    newList.add(model);
                }
            }
            saveList(newList);
        }
    }
}
