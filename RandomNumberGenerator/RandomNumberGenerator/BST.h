#pragma once

#ifndef BST_H_INCLUDED
#define	BST_H_INCLUDED

#include<iostream>

typedef struct _Node
{
	int key;
	struct _Node *left;
	struct _Node *right;
}
Node;

class BinaryTree
{
public:
	Node *Add_Node(Node* root, float data);
	bool Search(Node* node, float key);

private:
	Node* m_root;
};

#endif