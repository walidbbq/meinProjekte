<html>
<head>
</head>
<body>
<?php
require_once ('kunde1.php');
session_start();

$kunde1=$_SESSION['kunde1'];

echo "Herzlich Willkommen" . $kunde1->getVorname() . " " .
    $kunde1->getNachname();


?>
</body>
</html>