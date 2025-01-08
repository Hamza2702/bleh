public String outputSubTree(){
  String toReturn = "";
  if (left != null) toReturn += left.outputSubTree();
  toReturn += Integer.toString(data) + " ";
  if (right != null) toReturn += right.outputSubTree();
  return toReturn;
}
