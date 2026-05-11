package mitarbeiter;

import mitarbeiter.visitor.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {

    private String name= "Schorsch";

    public AbstractMitarbeiter() {
    }

    public AbstractMitarbeiter(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public abstract void accept(final MitarbeiterVisitor visitor);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+"{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
