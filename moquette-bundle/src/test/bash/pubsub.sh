
# http://air.imag.fr/index.php/Mosquitto#Souscription_en_CLI
BROKER=localhost
mosquitto_sub -h $BROKER -d -t /openHAB1234/out/# &

BROKER=localhost
mosquitto_pub -h $BROKER -d -t /openHAB1234/out/Temperature/state -m 19.5

mosquitto_pub -h $BROKER -d -t /openHAB1234/out/Humidity/state -m 70

mosquitto_pub -h $BROKER -d -t /openHAB1234/out/Temperature/state -m 21.5

mosquitto_pub -h $BROKER -d -t /openHAB1234/out/Humidity/state -m 81
