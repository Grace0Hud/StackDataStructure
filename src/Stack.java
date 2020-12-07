public class Stack
{
    private static class Node
    {
        //instance variables
        private int data;
        private Node link;

        public Node(int data, Node link)
        {
            this.data = data;
            this.link = link;
        }//end constructor

        //getters/setters
        public int getData()
        {
            return data;
        }

        public Node getLink() {
            return link;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLink(Node link) {
            this.link = link;
        }

        //toString
        public String toString()
        {
            return "data: " + data + " links to " + link;
        }
    }//end class node
}//end stack class
