package com.google.codelab.corotinemvvm.ui.main

import com.google.codelab.corotinemvvm.R
import com.google.codelab.corotinemvvm.databinding.CellArticleBinding
import com.google.codelab.corotinemvvm.model.Article
import com.xwray.groupie.databinding.BindableItem

class ArticleListItemFactory(private val item: Article) : BindableItem<CellArticleBinding>() {
    override fun getLayout(): Int = R.layout.cell_article

    override fun bind(viewBinding: CellArticleBinding, position: Int) {
        viewBinding.item = item
    }
}
