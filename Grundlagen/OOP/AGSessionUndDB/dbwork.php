<?php
require_once 'produkt.php';
require_once 'bestellung.php';
class Dbwork {
    
private static $conn;

public static function erstelleVerbindugn() {
    $servername= 'localhost';
    $dbname= 'dbapp1';
    $username='root';
    $password='';
    $con= new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
    Dbwork::$conn=$con;
    
}


public static function leseProdukte () {
    $sql="select * from produkte";
    $produkte=Dbwork::$conn->query($sql);
    
    $prodTab=array();
    
    foreach ($produkte as $zeile) {
        $pid=$zeile['pid'];
        $produktname=$zeile['produktname'];
        $beschreibung=$zeile['beschreibung'];
        $preis= $zeile['preis'];
        
        
        $p= new produkt($pid, $produktname, $beschreibung, $preis);
        $prodTab[]=$p;
        
       
       
    }
    
    return $prodTab;
    
}

public static function eintragBestellung ($bestellung) {
    
    $sql_ins="insert into bestellungen (vornamekunde,nachnamekunde,strasse,hausnr,plz,wohnort,Bestellung) Values 
            ('".$bestellung->VornameKunde."','".$bestellung->NachnameKunde."' , '".$bestellung->strasse."',".
             $bestellung->hausnr.",".$bestellung->plz.",'".$bestellung->wohnort."' , ".$bestellung->bestellung->pid.")";
    

            Dbwork::$conn->exec($sql_ins);
//             echo $sql_ins;
   
    
}


}
// Dbwork:: erstelleVerbindugn();

// session_start();
// $_SESSION['produkte']=Dbwork::leseProdukte();

// Dbwork::leseProdukte();
// $b=new bestellung("hamsti", "bamsti", "luxm", 47, 51066, "koeln", 1);
// Dbwork::eintragBestellung($b);


?>