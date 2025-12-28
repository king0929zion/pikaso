.class public final Ll0/r;
.super Ln0/x;
.source "SourceFile"


# static fields
.field public static final a:Ll0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll0/r;->a:Ll0/r;

    return-void
.end method


# virtual methods
.method public final f(Ln0/L;Ljava/util/List;J)LM1/j;
    .locals 7

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v1, Ld2/t;->d:Ld2/t;

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result p2

    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result p3

    sget-object p4, Ll0/p;->g:Ll0/p;

    invoke-virtual {p1, p2, p3, v1, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll0/j;

    invoke-interface {p2, p3, p4}, Ll0/j;->a(J)Ll0/o;

    move-result-object p2

    iget v0, p2, Ll0/o;->d:I

    invoke-static {p3, p4, v0}, La/a;->p(JI)I

    move-result v0

    iget v2, p2, Ll0/o;->e:I

    invoke-static {p3, p4, v2}, La/a;->o(JI)I

    move-result p3

    new-instance p4, LT/b;

    const/4 v2, 0x1

    invoke-direct {p4, p2, v2}, LT/b;-><init>(Ll0/o;I)V

    invoke-virtual {p1, v0, p3, v1, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/j;

    invoke-interface {v5, p3, p4}, Ll0/j;->a(J)Ll0/o;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    move v2, v3

    move v4, v2

    :goto_1
    if-ge v3, p2, :cond_3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll0/o;

    iget v6, v5, Ll0/o;->d:I

    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v5, v5, Ll0/o;->e:I

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-static {p3, p4, v2}, La/a;->p(JI)I

    move-result p2

    invoke-static {p3, p4, v4}, La/a;->o(JI)I

    move-result p3

    new-instance p4, LD/y;

    const/16 v2, 0xd

    invoke-direct {p4, v2, v0}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2, p3, v1, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    :goto_2
    return-object p1
.end method
