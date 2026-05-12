package event;

public record PropertyChangedEvent(Object soure,String propertyName, Object oldValue, Object newValue) {



}
