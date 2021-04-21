@EnvioFormTricentis
Feature: Envio de cotacao de veiculo
	
  @EnvioDeCotacao
  Scenario: Solicitar seguro de veiculo
    Given insiro os dados do veiculo
    And insiro os dados do seguro
    When insiro os dados do produto
    And seleciono a opcao de preco
    Then envio a cotacao
    And a cotacao e enviada com sucesso 
