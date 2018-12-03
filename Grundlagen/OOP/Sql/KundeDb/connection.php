<?php

require_once 'kunde.php';

$servername= 'localhost';
$dbname= 'testdb';
$username='root';
$password='';

$con= new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);

$sql_lesen="Select * From kunde";
$tabelle=$con->query($sql_lesen);

$KundeTab=array();

foreach ($tabelle as $zeille){
    $kid=$zeille['kid'];
    $vorname=$zeille['vorname'];
    $nachname=$zeille['nachname'];
    $email=$zeille['email'];
    
    $kundeZ= new kundedb($kid, $vorname, $nachname, $email);
    $KundeTab[]=$kundeZ;
}

for ($i=0; $i<sizeof($KundeTab); $i++) {
    $kundeAus=$KundeTab[$i];
    echo "$kundeAus->kid / $kundeAus->vorname/ $kundeAus->nachname/ $kundeAus->email </br>";
}


?>