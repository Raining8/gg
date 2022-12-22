class Vector {
	private float x, y, z;
	public Vector(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void print() {
		System.out.println("向量:("+x+","+y+","+z+")");
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public float getZ() {
		return z;
	}
	public float innerproduct(Vector v) {
		float l = x*v.getX() + y*v.getY() + z*v.getZ();
		return l;
	}
	
	public Vector outerproduct(Vector v){
		float u1 = y * v.getZ();
		float u1 = ;
		float u1 = ;
		Vector D = ;
		
		return ;
	}
}
public class aa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector A = new Vector(4, 5, 6);
		Vector B = new Vector(1, 2, 3);
		A.print();
		B.print();
		System.out.println("內積為"+A.innerproduct(B));
		Vector C = new Vector(A.outerproduct(B));
		C.print();
	}

}
