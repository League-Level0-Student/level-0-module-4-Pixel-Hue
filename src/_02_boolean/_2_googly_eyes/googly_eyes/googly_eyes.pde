PImage face;
void setup() {
   face = loadImage("TR1L3T91nzSrjq8Jpdo2B6r2VVuWZ4-kLTzOl1O5Bx0.png");
     size(800,800);
    face.resize(width,height);

}

void draw() {
  int eyeposX = mouseX;
  int eyeposY = mouseY;
  int xBoundry = 349;
  int BxBoundry = 382;
  int yBoundry = 222;
  int ByBoundry = 291;
  //int yBoundry = ;
  background(face);
  System.out.println(mouseX + "X");
  System.out.println(mouseY + "Y");
  fill(255, 255, 255);
  ellipse(368, 262, 58, 100);
  ellipse(428, 265, 74, 100);
  fill(0);
  
  if (mouseX <= 382 && mouseX >= 349 && mouseY <= 291 && mouseY >= 222) {
    ellipse(eyeposX, eyeposY + 1, 12, 12);
   ellipse(eyeposX + 55, eyeposY + 1, 12, 12);
  }
  else {
 ellipse(xBoundry + 55, eyeposY + 1, 12, 12);
  ellipse(BxBoundry - 35, eyeposY + 1, 12, 12);
  }
   eyeposX = mouseX;
   eyeposY = mouseY;
}
