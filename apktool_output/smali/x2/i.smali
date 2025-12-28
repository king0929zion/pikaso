.class public final Lx2/i;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Z)V
    .locals 0

    iput-object p1, p0, Lx2/i;->e:Ljava/util/List;

    iput-boolean p2, p0, Lx2/i;->f:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lx2/i;->e:Ljava/util/List;

    const/4 v7, 0x0

    iget-boolean v8, p0, Lx2/i;->f:Z

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez v8, :cond_3

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v2

    if-ne v2, v1, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_2

    if-ne v2, v1, :cond_1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p1, v0, p2, v1}, Lx2/j;->j(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result p1

    if-gez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lc2/g;

    invoke-direct {p2, p1, v0}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "List has more than one element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "List is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v2, Lu2/d;

    if-gez p2, :cond_4

    move p2, v0

    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-direct {v2, p2, v0, v1}, Lu2/b;-><init>(III)V

    instance-of v0, p1, Ljava/lang/String;

    iget v9, v2, Lu2/b;->e:I

    if-eqz v0, :cond_9

    if-le p2, v9, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v3, v11

    check-cast v3, Ljava/lang/String;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v0, 0x0

    move v1, p2

    move v5, v8

    invoke-static/range {v0 .. v5}, Lx2/j;->l(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    :cond_7
    move-object v11, v7

    :goto_1
    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_8

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lc2/g;

    invoke-direct {p2, p1, v11}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    if-eq p2, v9, :cond_e

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_9
    if-le p2, v9, :cond_a

    goto :goto_4

    :cond_a
    :goto_2
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v0, v11

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v1, 0x0

    move-object v2, p1

    move v3, p2

    move v5, v8

    invoke-static/range {v0 .. v5}, Lx2/j;->m(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    :cond_c
    move-object v11, v7

    :goto_3
    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_d

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lc2/g;

    invoke-direct {p2, p1, v11}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_d
    if-eq p2, v9, :cond_e

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_e
    :goto_4
    move-object p2, v7

    :goto_5
    if-eqz p2, :cond_f

    iget-object p1, p2, Lc2/g;->e:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v7, Lc2/g;

    iget-object p2, p2, Lc2/g;->d:Ljava/lang/Object;

    invoke-direct {v7, p2, p1}, Lc2/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f
    return-object v7
.end method
