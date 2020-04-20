package org.formacion.isp;

public class ProcesarTextoComplejo extends ProcesarTextoBasico implements Compleja{

    @Override
    public boolean correcto (Idioma idioma) {
        for (String palabra: texto) {
            if (! idioma.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
