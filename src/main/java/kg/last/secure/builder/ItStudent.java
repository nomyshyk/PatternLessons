package kg.last.secure.builder;

public class ItStudent {
    private int id;
    private String fio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    private ItStudent(ItStudentBuilder itStudentBuilder) {
        this.id = itStudentBuilder.id;
        this.fio = itStudentBuilder.fio;
    }

    public ItStudent(int id, String fio) {
        this.id = id;
        this.fio = fio;
    }

    public static class ItStudentBuilder{
        private int id;
        private String fio;

        /*public ItStudentBuilder(int id, String fio) {
            this.id = id;
            this.fio = fio;
        }*/

        public ItStudentBuilder setFio(String fio){
            this.fio = fio;
            return this;
        }

        public ItStudentBuilder setId(int id){
            this.id = id;
            return this;
        }

        public ItStudent build(){
            return new ItStudent(this);
        }
    }

    @Override
    public String toString() {
        return "ItStudent{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ItStudent itStudent = new ItStudentBuilder().setFio("Каспаров").build();
        System.out.println(itStudent);
    }
}
