public class ComplexObject {
    private String objectA;
    private String objectB;
    private String objectC;

    private ComplexObject() {}

    public static class Builder {
        private String objectA;
        private String objectB;
        private String objectC;

        public Builder setObjectA(String objectA) {
            this.objectA = objectA;
            return this;
        }

        public Builder setObjectB(String objectB) {
            this.objectB = objectB;
            return this;
        }

        public Builder setObjectC(String objectC) {
            this.objectC = objectC;
            return this;
        }

        public ComplexObject build() {
            ComplexObject complexObject = new ComplexObject();
            complexObject.objectA = this.objectA;
            complexObject.objectB = this.objectB;
            complexObject.objectC = this.objectC;
            return complexObject;
        }
    }
    @Override
    public String toString() {
        return "ComplexObject{" +
                "objectA='" + objectA + '\'' +
                ", objectB='" + objectB + '\'' +
                ", objectC='" + objectC + '\'' +
                '}';
    }
}
