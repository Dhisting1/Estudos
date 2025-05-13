package AtividadesPOO.atv5;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if (!validarData(dia, mes, ano)){
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    public boolean validarData(int dia, int mes, int ano){
        if (ano < 1){
            return false;
        }
        if (mes < 1 || mes > 12){
            return false;
        }

        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && isBissexto(ano)){
            diasMeses[1] = 29;
        }
        if (dia < 1 || dia > diasMeses[mes - 1]){
            return false;
        }
        return true;
    }

    public int compara(Data outraData){
        if (this.ano < outraData.ano){
            return -1;
        } else if (this.ano > outraData.ano) {
            return 1;
        }else {
            if (this.mes < outraData.mes){
                return -1;
            } else if (this.mes > outraData.mes) {
                return 1;
            }else {
                if (this.dia < outraData.dia){
                    return -1;
                } else if (this.dia > outraData.dia) {
                    return 1;
                }else {
                    return 0;
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    public String getMesExtenso(){
        String[] mesesExtenso = {
                    "Janeiro",
                    "Fevereiro",
                    "Março",
                    "Abril",
                    "Maio",
                    "Junho",
                    "Julho",
                    "Agosto",
                    "Setembro",
                    "Outubro",
                    "Novembro",
                    "Dezembro"
                    };

        return mesesExtenso[mes - 1];
    }

    public int getAno() {
        return ano;
    }
    public boolean isBissexto(int ano){
        if (this.ano % 400 == 0){
            return true;
        } else if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        }else {
            return false;
        }
    }
    public Data clone(){
        return new Data(dia, mes, ano);
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
