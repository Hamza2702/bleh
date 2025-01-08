public class LinearNode<T>{
  private LinearNode<T> next;
  private T element;

  public LinearNode(){
    next = null;
    element = null;
  }

  public LinearNode(T elem){
    next = null;
    element = elem;
  }

  public LinearNode<T> getNext(){
    return next;
  }

  public void setNext (LinearNode<T> node){
    next = node;
  }

  public T getElement(){
     return element;
  }

  public void setElement (T elem){
    element = elem;
  }

  public int size(){
    if (next == null){ // Base case
      return 1;
    } else { // Recursive step
      return 1 + next.size();
    }
  }

  public String toString(){
    if (next == null){
      return element.toString(); // Base case
    } else { // Recursive case
      return element.toString() + ", " + next.toString();
    }
  }

  public LinearNode<T> copy(){
    // Copy the node (non-recursive)
    LinearNode<T> current = new LinearNode<>(element);

    // Terminating case is next == null (nothing to do)
    if (next != null){
      current.next = next.copy();
    }
    return current;
  }
}
