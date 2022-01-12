package com.donegel.blockchain.service;
import com.donegel.blockchain.Blockchain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VaccineCountService {
	Blockchain blockchain = new Blockchain(4);
	public Blockchain getCount(List<String> wordList) {

		wordList.forEach((v) ->
				blockchain.addBlock(blockchain.newBlock(v)));
		System.out.println("Blockchain valid: " +blockchain.validateBlockchain());
		System.out.println(blockchain);
		return (Blockchain) blockchain;
	}

}