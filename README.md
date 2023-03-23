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


# Ciclesoft - Sistema de Vendas de Bicicletas

Bom, basicamente a Ciclesoft vem para sanar os problemas na logística de venda e administração do comércio ligado a rede e indústria de bicicletas, focados nisso,
desenvolvemos um software na linguagem de programação JAVA que atende todas essas demandas. O Comércio e a prestação de serviços no ramo de bicicletas, é conhecido no 
Brasil por se tratar, geralmente, de pequenas empresas com características extremamente manuais. A Ciclesoft se trata, então, de um sistema de vendas e controle de 
estoque que são realizados dentro destas pequenas empresas, possibilitando a realização do cadastro do cliente, a validação de estoque dos produtos, também a validação 
de pedido, entre outros processos e por fim realizar a venda do produto para o cliente, que no caso são bicicletas já montadas.


# Coisas a definir para o escopo/esboço

Precisamos definir qual forma de pagamento aceita : 

Precisamos definir quais produtos vamos vender, se será vendido apenas bicicletas ou tambem peças separadamente, e quanto terá de estoque cada um,
ou se tera um prazo de envio


# CLASSES 

Apos a discução e criação das classes, foi atribuido a responsabilidade para cada membro cuidar de uma classe 
![image](https://user-images.githubusercontent.com/119326011/225166173-6f264939-7962-4d63-af4f-37fe6d7a75af.png)

CLasse Menu

Classe Cliente

Classe Vendas

Classe Produtos

Classe Fornecedores

Classe Funcionários

Classe Pagamento


Agora o proximo passo é fazer o Diagrama de Classes para cada Classe.

https://app.diagrams.net/#G1pkzyiKCy4ROKPWk7GRoo-noety9sbJw1  ( link compartilhado para diagrama de classe )





# CLASSE PAGAMENTOS

	[1] Pagamentos - Click

	[1] FORMA DE PAGAMENTO - click

	INFORME QUAL O ID DA VENDA.


		VERIFICAÇÃO

		INFORME A FORMA DE PAGAMENTO

		[1]DINHEIRO À VISTA
	
		[2]CARTAO
	
			[1] DEBITO
		
			[2] CREDITO
		
				[1]AVISTA
			
				[2]PARCELADO
			
		[3]BOLETO - PRAZO 30 dias
	
		[4]PIX - à vista
			[1]GERAR QRCODE

			[2]GERAR CHAVE
	
		[5]DEPOSITO - à vista
	
		Os dados para deposito são :
	
		[6]TRANSFERENCIA - à vista
	
		Os dados para transferencia são:


	[2] ATUALIZAR VENDA

	[3] EXCLUIR VENDA

	[4] CONSULTAR VENDA

