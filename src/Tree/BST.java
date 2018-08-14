package Tree;

import java.util.Stack;

import Structs.QueueBaseLoop;

/*
 *  二分搜索树, 左小于中小于右 基本实现
 *  binary serach tree
 *  
 *  
 *  更多相关问题：  二分搜索树具有顺序性
 *     floor:比给定小但最大的元素
 *     ceil :比给定大但最小的元素
 *     
 *     rank:  给出一个元素问排名是多少 按大小
 *     select:  给出排名来查询元素
 *     
 *     维护size: 以当前节点为根的子数节点数
 *     
 *     维护depth： 深度值
 *     
 *     支持重复元素的二分搜索树(添加 count:记录当前节点存储重复元素个数)
 *     
 */
public class BST<E extends Comparable<E>> {
   private class Node{
	   public E e;
	   public Node left,right;
	   
	   public Node(E e){
	   this.e=e;
	   left=null;
	   right=null;
      }
   }  
   
   private Node root;
   private int size;
   public BST(){
	   root=null;
	   size=0;
   }
   public int size(){
	   return size;
   }
   public boolean isempty(){
	   return size==0;
   }
   // 向二分搜索中添加新元素
   public void add(E e){
   	 root=add(root,e);
   }
   //递归
   private Node add(Node node,E e){
	   if(node==null){ //如果传入的节点为空，将传入的e构造成根节点
		 size++; 
	     return new Node(e);
	   }   
	   if(e.compareTo(node.e)<0) 
		   node.left= add(node.left,e); 
	   else if(e.compareTo(node.e)>0)
		   node.right=add(node.right,e);
	   
	   return node;

   }
   //查询操作
   public boolean contains(E e){
	   return contains(root,e);
   }
   //递归操作
   private boolean contains(Node node,E e){
	   if(node==null)
		   return false;
	   if(e.compareTo(node.e)==0)
		   return true;
	   else if(e.compareTo(node.e)<0)
		   return contains(node.left,e);
	   else
		   return contains(node.right,e);
   }
   //遍历操作，前序遍历
   public void preOrder(){
	   preOrder(root); 
   }
   private void preOrder(Node node){
	   if(node==null)
		   return;
	   System.out.println(node.e);
	   preOrder(node.left);
	   preOrder(node.right);
   }
    //后续遍历的一个应用：为二分搜索树释放内存
    
   
   //前序遍历的非递归写法,用到了栈的思想
   public void preOrderNR(){
	   Stack<Node> stack=new Stack<>();
	   stack.push(root);
	   while(!stack.isEmpty()){
		   Node cur=stack.pop();
		   System.out.println(cur.e);
		   if(cur.right!=null)
		      stack.push(cur.right);
		   if(cur.left!=null)
		      stack.push(cur.left);
	   }
   }
   //二分搜索树的层序遍历，用到了自己构造的循环队列
   public void levelOrder(){
	   QueueBaseLoop<Node> queue=new QueueBaseLoop<>();
	   queue.enqueue(root);
	   while(!queue.isEmpty()){
		   Node cur=queue.dequeue();
		   System.out.println(cur.e);
		   if(cur.left!=null)
		      queue.enqueue(cur.left);
		   if(cur.right!=null)
		   queue.enqueue(cur.right); 
	   }
   }
   //找到二分搜索树的最小值，递归实现
    public E minimum(){
    	if(size==0)
    		throw new IllegalArgumentException("BST IS empty");
    	return minimum(root).e;
    }
    private Node minimum(Node node){
    	if(node.left==null)
    		return node;
    	return minimum(node.left);
    }
    //删除二分搜索树的最小值所在节点并返回，递归实现。
    public E delmin(){
    	E ret=minimum();
    	root=delmin(root);
    	return ret; 
    }
    public Node delmin(Node node){
    	if(node.left==null){
    		Node rightNode=node.right;
    		node.right=null;
    		size--;
    		return rightNode;
    	}
    	node.left=delmin(node.left);
    	return node;
    }
     //删除给定值的元素
    public void remove(E e){
    	root=remove(root,e);
    }
    private Node remove(Node node,E e){
    	if(node==null)
    		return null;
    	if(e.compareTo(node.e)<0){
    		node.left=remove(node.left,e);
    		return node;
    	}
    	else if(e.compareTo(node.e)>0){
    		node.right=remove(node.right,e);
    	    return node;
    	}else{// 找到了
    		if(node.left==null){//终极情况，没有左子树
    			Node rightNode=node.right;
    			node.right=null;
    			size--;
    			return rightNode;
    		}
    		if(node.right==null){//情况之二，没有右子树
    			Node leftNode=node.left;
    			node.left=null;
    			size--;
    			return leftNode;
    		}
    		
    		//左右子树都有的情况
    		// 找到比待删节点大的最小节点，即待删节点右子树的最小节点
    		//用这个节点代替删除节点的位置
    		Node right_min=minimum(node.right);
    		right_min.left=node.left;
    		//将待删节点的右子树删除掉最小值后返回并挂给新节点的右侧
    		right_min.right=delmin(node.right);
    		
    		node.left=node.right=null;
    		return right_min;
    	}
    }
}
