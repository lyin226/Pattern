package com.novel.composite.transparent;

import com.novel.composite.security.Composite;
import com.novel.composite.security.Leaf;

public class Client {
	// 安全模式
		public static void main(String[] args) {
			Composite root = new Composite("根节点");
			Leaf c1 = new Leaf("   叶子节点");
			Composite c2 = new Composite("   树枝节点");
			
			Leaf c3 = new Leaf("        树枝节点的叶子节点");
			root.addComponent(c1);
			root.addComponent(c2);
			c2.addComponent(c3);
			
			root.print();
		}
}
