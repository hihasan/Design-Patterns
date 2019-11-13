//import 'package:practice_1/practice_1.dart' as practice_1;
//
//main(List<String> arguments) {
//  print('Hello world: ${practice_1.calculate()}!');
//}
class Box{
  int height,width,length;

  Box(this.height,this.width,this.length);
  
  // ignore: missing_return
  int printBox(){
    return height*width*length;
  }
}
void main(){
  var box=Box(2,3,4);
  
  print("The Box Volume is: ${box.printBox()}");
}
