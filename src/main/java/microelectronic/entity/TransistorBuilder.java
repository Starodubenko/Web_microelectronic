package microelectronic.entity;

public class TransistorBuilder {

    protected int price;
    private Device.ScMaterial semiconductorMaterial;
    private int baseCurrent;
    private int gainCoefficient;
    private boolean key = false;

    public TransistorBuilder() {
    }

    public TransistorBuilder SemiconductorMaterial(Device.ScMaterial semiconductorMaterial) {
        this.semiconductorMaterial = semiconductorMaterial;
        return this;
    }

    public TransistorBuilder Price(int price) {
        this.price = price;
        return this;
    }

    public TransistorBuilder BaseCurrent(int baseCurrent) {
        this.baseCurrent = baseCurrent;
        return this;
    }

    public TransistorBuilder GainCoefficient(int gainCoefficient) {
        this.gainCoefficient = gainCoefficient;
        return this;
    }

    public TransistorBuilder Key(boolean key) {
        this.key = key;
        return this;
    }

    public Transistor bildTransistor() {
        return new Transistor(semiconductorMaterial, baseCurrent, gainCoefficient, key, price);
    }
}
