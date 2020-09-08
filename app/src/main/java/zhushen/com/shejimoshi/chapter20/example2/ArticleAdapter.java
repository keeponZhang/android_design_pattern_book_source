package zhushen.com.shejimoshi.chapter20.example2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.List;

import zhushen.com.shejimoshi.R;

/**
 * Created by Zhushen on 2018/6/4.
 */
public class ArticleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Article> mArticles;
//    AdapterView.OnItemClickListener<Article> mClickListener;

    public ArticleAdapter(List<Article> mArticles) {
        this.mArticles = mArticles;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return createArticleViewHolder(parent);
    }

    private RecyclerView.ViewHolder createArticleViewHolder(ViewGroup parent) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycleview_article_item,parent,false
        );
        return new ArticleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ArticleViewHolder){
//            bindViewForArticle(holder,position);
        }
    }

//    private void bindViewForArticle(RecyclerView.ViewHolder holder, int position) {
//        ArticleViewHolder articleViewHolder  = (ArticleViewHolder) holder;
//        final Article article = getItem(position);
//        articleViewHolder.title.setText(article.title);
//        articleViewHolder.publishTime.setText(article.publishTime);
//        articleViewHolder.title.author(article.author);
//
//        articleViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mClickListener != null){
//                    mClickListener.onClick(article);
//                }
//            }
//        });
//    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }



    protected Article getItem(int position){
        return mArticles.get(position);
    }


    static class ArticleViewHolder extends RecyclerView.ViewHolder{
        public TextView title,publishTime,author;

        public ArticleViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.article_title);
            publishTime = (TextView)itemView.findViewById(R.id.article_publish_time);
            author = (TextView)itemView.findViewById(R.id.article_author);
        }


    }
}
