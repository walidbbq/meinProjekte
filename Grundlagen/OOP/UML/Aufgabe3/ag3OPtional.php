<?php

interface shape  {
    
    public function draw ();
}



class circle implements shape{
    
    function draw() {
        echo "Circle wird gezeichnet";
    }
        
}

class square implements shape {
    function draw() {
        echo "Square wird gezeichnet";
    }
}


class rectangle implements shape {
    function draw(){
        echo "Rectangle wird gezeichnet";
    }
}


class ShapeFactory {
    
    function getShape($shape) {
        switch ($shape) {
            case "Circle" : return new circle();
            break;
            case "Square" : return new square();
            break;
            case "Rectangle" : return new rectangle();
            break;
            
        }
    }
}



$sf = new ShapeFactory();
$circle = $sf->getShape("Circle");
$circle -> draw();

echo "<br>";

$square= $sf->getShape("Square");
$square-> draw();

echo "<br>";
$rectangle= $sf->getShape("Rectangle");
$rectangle->draw();


?>