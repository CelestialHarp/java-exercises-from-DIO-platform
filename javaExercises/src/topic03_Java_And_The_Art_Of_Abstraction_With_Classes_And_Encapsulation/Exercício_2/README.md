# Write code where we control the functions of a car, it must have the following functions:
- Turn on the car
- Turn off the car
- Accelerate
- Decrease speed;
- Turn left/right
- Check speed
- Change gear
## Follow the following rules in the implementation:

- When the car is created it must start turned off, in neutral gear and with its speed at 0
- The turned off car cannot perform any function
When the car is accelerated it must increment its speed by 1km (it can reach a maximum of 120km)
- When decreasing the car's speed it must decrement its speed by 1 km (it can reach a minimum of 0km)
- The car must have 6 gears, it should not be allowed to skip a gear in the car

## The car's speed must respect the following limits for each gear:
- if the car is in gear 0 (neutral) it cannot accelerate
- if it is in 1st gear its speed can be between 0km and 20km
- if it is in 2nd gear its speed can be between 21km and 40km
- if it is in 3rd gear its speed can be between 41km and 60km
- if it is in 4th gear its speed can be between 61km and 80km
- if it is in 5th gear its speed can be between 81km and 100km
- if it is in 6th gear its speed can be between 101km and 120km
- The car can be turned off if it is in neutral (gear 0) and its speed is 0 km
- The car can only turn left/right if its speed is at least 1km and at most 40km

[PT-BR]:

# Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:

- Ligar o carro -

- Desligar o carro -

- Acelerar

- diminuir velocidade

- virar para esquerda/direita

- verificar velocidade

- trocar a marcha

## Siga as seguintes regras na implementação:



- Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0

- O carro desligado não pode realizar nenhuma função

Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);

- Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km)

- O carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro



## A velocidade do carro deve respeitar os seguintes limites para cada velocidade:

- se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar

- se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km

- se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km

- se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km

- se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km

- se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km

- se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km

- O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km

- O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km