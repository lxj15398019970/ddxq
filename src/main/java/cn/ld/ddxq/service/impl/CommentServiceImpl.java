package cn.ld.ddxq.service.impl;
import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.ICommentDAO;
import cn.ld.ddxq.model.Comment;
import cn.ld.ddxq.service.ICommentService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("CommentServiceImpl")
public class CommentServiceImpl extends AbstractBaseService<IBaseDAO<Comment>, Comment> implements ICommentService<IBaseDAO<Comment>,Comment>{
    @Autowired
    private ICommentDAO commentDAO;

    @Override
    public IBaseDAO<Comment> getDao() {
        return commentDAO;
    }


}
