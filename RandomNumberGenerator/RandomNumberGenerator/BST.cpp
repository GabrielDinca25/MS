#include "BST.h"

Node* BinaryTree::Add_Node(Node* root, float data)
{
	if (root == NULL)
	{
		root = (Node *)malloc(sizeof(Node));
		root->key = data;
		root->left = root->right = NULL;
	}
	else if (data <= root->key)
	{
		root->left = Add_Node(root->left, data);
	}
	else {
		root->right = Add_Node(root->right, data);
	}
	return root;
}

bool BinaryTree::Search(Node* root, float key)
{
	if (root == NULL)
	{
		return false;
	}
	else if (key == root->key)
	{
		return true;
	}
	else if(key < root->key)
	{
		return Search(root->left, key);
	}
	else
	{
		return Search(root->right, key);
	}
}