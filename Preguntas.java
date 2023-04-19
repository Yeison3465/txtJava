public class Preguntas {
    private double pregunta1;
    private double pregunta2;
    private double pregunta3;
    private double pregunta4;
    private double pregunta5;
    private double pregunta6;
    private double promedio;
    public Preguntas() {
        this.pregunta1 = 0.0;
        this.pregunta2 = 0.0;
        this.pregunta3 = 0.0;
        this.pregunta4 = 0.0;
        this.pregunta5 = 0.0;
        this.pregunta6 = 0.0;
        this.promedio = 0.0;
    }
    
    
    public double getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(double pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public double getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(double pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public double getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(double pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public double getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(double pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public double getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(double pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public double getPregunta6() {
        return pregunta6;
    }

    public void setPregunta6(double pregunta6) {
        this.pregunta6 = pregunta6;
    }

    public double calculador(double nota4) {
        double resultado = nota4 * 0.05;
        return resultado;
    }

    public void definitiva(){
        double promee = 0;
        promee = promee + getPregunta1() + getPregunta2() + getPregunta3() + getPregunta4() + getPregunta5() + getPregunta6();
        promedio = promee / 6;
        System.out.println(promedio);
    }


    public double getPromedio() {
        return promedio;
    }


    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    



    
}
