.class public final LE/l;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final d:LE/l;

.field public static final e:LE/l;

.field public static final f:LE/l;

.field public static final g:LE/l;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, LE/l;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LE/l;-><init>(III)V

    sput-object v0, LE/l;->d:LE/l;

    new-instance v0, LE/l;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v1, v2}, LE/l;-><init>(III)V

    sput-object v0, LE/l;->e:LE/l;

    new-instance v0, LE/l;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, LE/l;-><init>(III)V

    sput-object v0, LE/l;->f:LE/l;

    new-instance v0, LE/l;

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, LE/l;-><init>(III)V

    sput-object v0, LE/l;->g:LE/l;

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    iput p3, p0, LE/l;->c:I

    invoke-direct {p0, p1, p2}, LE/y;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 5

    iget v0, p0, LE/l;->c:I

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2}, LE/z;->a(I)I

    move-result p1

    instance-of p2, v0, LD/x0;

    if-eqz p2, :cond_0

    move-object p2, v0

    check-cast p2, LD/x0;

    iget-object p2, p2, LD/x0;->a:LD/w0;

    iget-object v1, p4, LD/s;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget p2, p3, LD/D0;->s:I

    invoke-virtual {p3, p2, p1}, LD/D0;->D(II)I

    move-result p2

    invoke-virtual {p3, p2}, LD/D0;->g(I)I

    move-result p2

    iget-object v1, p3, LD/D0;->c:[Ljava/lang/Object;

    aget-object v2, v1, p2

    aput-object v0, v1, p2

    instance-of p2, v2, LD/x0;

    if-eqz p2, :cond_1

    invoke-virtual {p3}, LD/D0;->o()I

    move-result p2

    iget v0, p3, LD/D0;->s:I

    invoke-virtual {p3, v0, p1}, LD/D0;->D(II)I

    move-result p1

    sub-int/2addr p2, p1

    check-cast v2, LD/x0;

    iget-object p1, v2, LD/x0;->a:LD/w0;

    const/4 p3, -0x1

    invoke-virtual {p4, p1, p2, p3, p3}, LD/s;->h(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_1
    instance-of p1, v2, LD/n0;

    if-eqz p1, :cond_2

    check-cast v2, LD/n0;

    invoke-virtual {v2}, LD/n0;->d()V

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/c;

    invoke-virtual {p1, p2}, LE/z;->a(I)I

    move-result p1

    instance-of p2, v0, LD/x0;

    if-eqz p2, :cond_3

    move-object p2, v0

    check-cast p2, LD/x0;

    iget-object p2, p2, LD/x0;->a:LD/w0;

    iget-object v2, p4, LD/s;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p3, v1}, LD/D0;->c(LD/c;)I

    move-result p2

    invoke-virtual {p3, p2, p1}, LD/D0;->D(II)I

    move-result v1

    invoke-virtual {p3, v1}, LD/D0;->g(I)I

    move-result v1

    iget-object v2, p3, LD/D0;->c:[Ljava/lang/Object;

    aget-object v3, v2, v1

    aput-object v0, v2, v1

    instance-of v0, v3, LD/x0;

    if-eqz v0, :cond_5

    invoke-virtual {p3}, LD/D0;->o()I

    move-result v0

    invoke-virtual {p3, p2, p1}, LD/D0;->D(II)I

    move-result p1

    sub-int/2addr v0, p1

    check-cast v3, LD/x0;

    iget-object p1, v3, LD/x0;->b:LD/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LD/c;->a()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p3, p1}, LD/D0;->c(LD/c;)I

    move-result p1

    invoke-virtual {p3}, LD/D0;->o()I

    move-result p2

    iget-object v1, p3, LD/D0;->b:[I

    invoke-virtual {p3, p1}, LD/D0;->q(I)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {p3, v2}, LD/D0;->p(I)I

    move-result v2

    invoke-virtual {p3, v1, v2}, LD/D0;->f([II)I

    move-result p3

    sub-int/2addr p2, p3

    goto :goto_1

    :cond_4
    const/4 p1, -0x1

    move p2, p1

    :goto_1
    iget-object p3, v3, LD/x0;->a:LD/w0;

    invoke-virtual {p4, p3, v0, p1, p2}, LD/s;->h(Ljava/lang/Object;III)V

    goto :goto_2

    :cond_5
    instance-of p1, v3, LD/n0;

    if-eqz p1, :cond_6

    check-cast v3, LD/n0;

    invoke-virtual {v3}, LD/n0;->d()V

    :cond_6
    :goto_2
    return-void

    :pswitch_1
    const/4 p4, 0x0

    invoke-virtual {p1, p4}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/c;

    invoke-virtual {p1, p4}, LE/z;->a(I)I

    move-result p1

    invoke-virtual {p2}, LB0/a;->M()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v0}, LD/D0;->c(LD/c;)I

    move-result p4

    invoke-virtual {p3, p4}, LD/D0;->p(I)I

    move-result p4

    iget-object v0, p3, LD/D0;->b:[I

    invoke-static {v0, p4}, LD/d;->j([II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p3, LD/D0;->c:[Ljava/lang/Object;

    iget-object v1, p3, LD/D0;->b:[I

    invoke-virtual {p3, v1, p4}, LD/D0;->f([II)I

    move-result p4

    invoke-virtual {p3, p4}, LD/D0;->g(I)I

    move-result p3

    aget-object p3, v0, p3

    goto :goto_3

    :cond_7
    const/4 p3, 0x0

    :goto_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p3, Ln0/z;

    iget-object p2, p2, LB0/a;->d:Ljava/lang/Object;

    check-cast p2, Ln0/z;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p3, Ln0/z;->k:Ln0/z;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p4, :cond_8

    move p4, v1

    goto :goto_4

    :cond_8
    move p4, v0

    :goto_4
    const/4 v2, 0x0

    const-string v3, " Other tree: "

    const-string v4, "Cannot insert "

    if-nez p4, :cond_a

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " because it already has a parent. This tree: "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ln0/z;->e(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p3, Ln0/z;->k:Ln0/z;

    if-eqz p2, :cond_9

    invoke-virtual {p2, v0}, Ln0/z;->e(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_9
    move-object p2, v2

    :goto_5
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v2

    :cond_a
    iget-object p4, p3, Ln0/z;->l:Lo0/u;

    if-nez p4, :cond_e

    iput-object p2, p3, Ln0/z;->k:Ln0/z;

    iget-object p4, p2, Ln0/z;->h:LB2/i;

    iget-object v0, p4, LB2/i;->e:Ljava/lang/Object;

    check-cast v0, LF/d;

    invoke-virtual {v0, p1, p3}, LF/d;->a(ILjava/lang/Object;)V

    iget-object p1, p4, LB2/i;->f:Ljava/lang/Object;

    check-cast p1, LA0/c;

    invoke-virtual {p1}, LA0/c;->c()Ljava/lang/Object;

    invoke-virtual {p2}, Ln0/z;->A()V

    iget-boolean p1, p3, Ln0/z;->d:Z

    if-eqz p1, :cond_b

    iget p1, p2, Ln0/z;->g:I

    add-int/2addr p1, v1

    iput p1, p2, Ln0/z;->g:I

    :cond_b
    invoke-virtual {p2}, Ln0/z;->t()V

    iget-object p1, p2, Ln0/z;->l:Lo0/u;

    if-eqz p1, :cond_c

    invoke-virtual {p3, p1}, Ln0/z;->b(Lo0/u;)V

    :cond_c
    iget-object p1, p3, Ln0/z;->y:Ln0/I;

    iget p1, p1, Ln0/I;->m:I

    if-lez p1, :cond_d

    iget-object p1, p2, Ln0/z;->y:Ln0/I;

    iget p2, p1, Ln0/I;->m:I

    add-int/2addr p2, v1

    invoke-virtual {p1, p2}, Ln0/I;->b(I)V

    :cond_d
    return-void

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " because it already has an owner. This tree: "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ln0/z;->e(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ln0/z;->e(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v2

    :pswitch_2
    const/4 p4, 0x0

    invoke-virtual {p1, p4}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo2/a;

    invoke-interface {v0}, Lo2/a;->c()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LE/z;->b(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD/c;

    invoke-virtual {p1, p4}, LE/z;->a(I)I

    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v1}, LD/D0;->c(LD/c;)I

    move-result p1

    invoke-virtual {p3, p1, v0}, LD/D0;->K(ILjava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object p1, v0

    check-cast p1, Ln0/z;

    invoke-virtual {p2, v0}, LB0/a;->g(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    iget v0, p0, LE/l;->c:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "groupSlotIndex"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "groupSlotIndex"

    goto :goto_1

    :cond_1
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "insertIndex"

    goto :goto_2

    :cond_2
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr2/a;->t(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "insertIndex"

    goto :goto_3

    :cond_3
    invoke-super {p0, p1}, LE/y;->b(I)Ljava/lang/String;

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(I)Ljava/lang/String;
    .locals 1

    iget v0, p0, LE/l;->c:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "value"

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "value"

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "anchor"

    goto :goto_1

    :cond_2
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "groupAnchor"

    goto :goto_2

    :cond_3
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_2
    const/4 v0, 0x0

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "factory"

    goto :goto_3

    :cond_4
    const/4 v0, 0x1

    invoke-static {p1, v0}, La/a;->w(II)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "groupAnchor"

    goto :goto_3

    :cond_5
    invoke-super {p0, p1}, LE/y;->c(I)Ljava/lang/String;

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
