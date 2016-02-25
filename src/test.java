public class test {

	public void TriType(){
 int i,j,k,match,ncases;
 String message ;
 printf("Enter number of triangles \n") ;
 scanf ( "%d", &ncases ) ;
 while ( ncases ) {
 ncases --;
 printf("\nEnter sides of triangle\n") ;
 scanf ( "%d %d %d", &i , &j , &k ) ;
 if (i >= j + k || j >= k + i || k >= i + j) {
message = "not a triangle";
 }
 else {
 match = 0 ;
 if ( i == j ) {
 match++ ;
 }
 if( j == k ) {
 match++ ;
 }
 if( k == i){
 match++ ;
 };
 if ( match == 0 ) {
 message = "scalene triangle";
 }
 else {
 if( match == 1 ) {
 message = "isosceles triangle"; 
 }
 else {
 message = "equilateral triangle";
 }
 }
 }
 printf ( "%d %d %d %20s\n", i , j , k , message ) ;
 }
 return 0;
}
}
