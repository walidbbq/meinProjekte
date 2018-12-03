<a href="flow2.php">Weiterleitung auf 3</a><br>
<?php
session_start();
require_once ('kunde1.php');

$kVorname=  $_POST['vorname'];
$kNachname= $_POST['nachname'];
$kEmail=    $_POST['email'];

$k1=new kunde1();

$k1->setVorname($kVorname);
echo $k1->getVorname();

$k1->setNachname($kNachname);
echo $k1->getNachname();

$k1->setEmail($kEmail);
echo $k1->getEmail();

$_SESSION['kunde1']=$k1;


?>