public class Coche {
    String marca,modelo;
    int ano;
    double km,litros;
    public void encender(){
        System.out.println(this.marca+"-"+this.modelo+" esta encendido");
    }
    public void apagar(){
        System.out.println(this.marca+"-"+this.modelo+" esta apagado");
    }
    public void conducir(double kilometrosRecorridos){
        double litrosGastados = kilometrosRecorridos*0.07;
        if (litrosGastados>litros) {
            System.out.println("No hay suficiente gasolina");
        }else{
        this.litros=this.litros-litrosGastados;
        this.km=this.km+kilometrosRecorridos;
        System.out.println("conduciendo "+kilometrosRecorridos+
                            " se han gastado "+litrosGastados+"L");
        }
    }
    public void repostar(double litrosRepostados){
        this.litros=this.litros+litrosRepostados;
        System.out.println("se han repostado "+litrosRepostados);
    }
    public void info(){
        System.out.println("*************************");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Año: "+this.ano);
        System.out.println("km: "+this.km);
        System.out.println("litros: "+this.litros);
    }
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca="Citroen";
        coche.modelo="C3";
        coche.ano=2008;
        coche.km=5;
        coche.litros=3.5;
        coche.encender();
        coche.repostar(50);
        coche.info();
        coche.conducir(250);
        coche.info();
        coche.conducir(700);
        coche.info();
        coche.apagar();
    }
}
