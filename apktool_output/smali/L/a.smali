.class public final LL/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/e;
.implements Lo2/f;
.implements Lo2/g;
.implements Lc2/c;


# instance fields
.field public final d:I

.field public final e:Z

.field public f:Lp2/h;

.field public g:LD/n0;

.field public h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IZLp2/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LL/a;->d:I

    iput-boolean p2, p0, LL/a;->e:Z

    iput-object p3, p0, LL/a;->f:Lp2/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LD/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LL/a;->b(Ljava/lang/Object;LD/n;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;LD/n;I)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LL/a;->d:I

    invoke-virtual {p2, v0}, LD/n;->O(I)LD/n;

    invoke-virtual {p0, p2}, LL/a;->d(LD/n;)V

    invoke-virtual {p2, p0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v1}, LL/b;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1, v1}, LL/b;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p3

    iget-object v1, p0, LL/a;->f:Lp2/h;

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lp2/r;->c(ILjava/lang/Object;)V

    check-cast v1, Lo2/f;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, v0}, Lo2/f;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, LD/n;->s()LD/n0;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, LD/u;

    invoke-direct {v1, p0, p1, p3}, LD/u;-><init>(LL/a;Ljava/lang/Object;I)V

    iput-object v1, p2, LD/n0;->d:Lo2/e;

    :cond_1
    return-object v0
.end method

.method public final d(LD/n;)V
    .locals 4

    iget-boolean v0, p0, LL/a;->e:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, LD/n;->w()LD/n0;

    move-result-object p1

    if-eqz p1, :cond_4

    iget v0, p1, LD/n0;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p1, LD/n0;->a:I

    iget-object v0, p0, LL/a;->g:LD/n0;

    invoke-static {v0, p1}, LL/b;->c(LD/n0;LD/n0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LL/a;->g:LD/n0;

    goto :goto_1

    :cond_0
    iget-object v0, p0, LL/a;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LL/a;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD/n0;

    invoke-static {v3, p1}, LL/b;->c(LD/n0;LD/n0;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final f(Lp2/h;)V
    .locals 5

    iget-object v0, p0, LL/a;->f:Lp2/h;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iput-object p1, p0, LL/a;->f:Lp2/h;

    iget-boolean p1, p0, LL/a;->e:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LL/a;->g:LD/n0;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p1, LD/n0;->b:LD/t;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, v0}, LD/t;->m(LD/n0;Ljava/lang/Object;)I

    :cond_0
    iput-object v0, p0, LL/a;->g:LD/n0;

    :cond_1
    iget-object p1, p0, LL/a;->h:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD/n0;

    iget-object v4, v3, LD/n0;->b:LD/t;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v3, v0}, LD/t;->m(LD/n0;Ljava/lang/Object;)I

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    return-void
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, LD/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget v0, p0, LL/a;->d:I

    invoke-virtual {p1, v0}, LD/n;->O(I)LD/n;

    invoke-virtual {p0, p1}, LL/a;->d(LD/n;)V

    invoke-virtual {p1, p0}, LD/n;->f(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    invoke-static {v2, v1}, LL/b;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v1}, LL/b;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr p2, v0

    iget-object v0, p0, LL/a;->f:Lp2/h;

    invoke-static {v2, v0}, Lp2/r;->c(ILjava/lang/Object;)V

    check-cast v0, Lo2/e;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, LD/n;->s()LD/n0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v2, p0}, Lp2/r;->c(ILjava/lang/Object;)V

    iput-object p0, p1, LD/n0;->d:Lo2/e;

    :cond_1
    return-object p2
.end method
