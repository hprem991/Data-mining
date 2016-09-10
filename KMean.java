import java.util.*;
import java.lang.*;


class KMean{
	int Kmeans(double[][] centre, double input, double input2){
		double[] distance = new double[3];
		for(int i=0;i<centre.length;i++){
			distance[i] = distance(centre[i][0], centre[i][1], input, input2);
		}
		if(distance[0]<distance[1]){
			return (distance[0] < distance[2]? 1 : 3) ; //(distance[1] < distance[3]? 1 : 3));
		} else {
			return (distance[1] < distance[2]? 2 : 3);
		}
	}

	private double distance(double centreX, double centreY, double x, double y){
		return Math.sqrt((centreX - x) * (centreX - x) + (centreY - y)* (centreY - y));
	}
	
	private void print(int [][] cluser){
		for(int i = 0; i<cluser.length ; i++){
		//	System.out.println(cluser[i][0], cluser[i][1]);
		}
	}
	
	private void WSS(double [][] elements, double x, double y){
		double distance = 0, wss =0;
		for(int i = 0; i < elements.length;i++ ){
				distance += distance(elements[i][0], elements[i][1] , x ,y);
		}
		wss = distance * distance;
		System.out.println("Value of WSS "+wss);
	}
	
	private void BSS(int mul , double cx, double cy, double e, double d){
		double dist = distance(cx, cy , e ,d);
		double bss = 0;
		bss = mul * dist * dist;
		System.out.println("Value of BSS "+bss);
	}
	
	public static void main(String a[]){
		System.out.println("Init");
		Vector<Vector<Integer> > cluster1 = new Vector<Vector<Integer> >();
		Vector<Vector<Integer> > cluster2 = new Vector<Vector<Integer> >();
		Vector<Vector<Integer> > cluster3 = new Vector<Vector<Integer> >();
		
//		Vector<Integer>[][] cluster1 = new Vector<int>[2][8];
//		Vector<int>[][] cluster2 = new Vector<int>[2][8];
//		Vector<int>[][] cluster3 = new Vector<int>[2][8];
		double[][] input = {{1,1},{1,2},{2,1},{2,3},{3,3},{4,5},{5,4},{6,5}};
		double[][] in = {{1,1},{1,2},{2,1},{2,3},{3,3},{4,5},{5,4},{6,5}};
		double[][] centre ={{1.33,1.33},{2.5,3},{5,4.67}};
		KMean ob = new KMean();
		double [][] c = {{1,1},{1,2},{2,1},{2,3}};
		//ob.WSS(c, 5,4.67 );
		ob.BSS(3, 5, 4.67, 3, 3);
		for(int i=0;i<input.length;i++){
			System.out.println(ob.Kmeans(centre,input[i][0],input[i][1]));
//			if(cluster == 1) {
//				cluster1.add(e)   .add(input[i][0],input[i][1]);
//			} else if(cluster == 2){
//				cluster2.add(input[i][0],input[i][1]);
//			} else {
//				cluster3.add(input[i][0],input[i][1]);
//			}
			
		}
	}
}
