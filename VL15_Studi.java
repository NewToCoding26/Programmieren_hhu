public class VL15_Studi implements VL15_Sortable, VL17_ListData{
    
    private String name;
    private int matrikelNummmer;

    public VL15_Studi(String name, int matrikelNummmer) {
        this.name = name;
        this.matrikelNummmer = matrikelNummmer;
    }

    public String toString() {
        return matrikelNummmer + " " + name;
    }
    
    public int getMatrikelNummer() {
        return matrikelNummmer;
    }
    
    public double getSortKey() {
        return matrikelNummmer;
    }
}
