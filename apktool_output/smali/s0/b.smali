.class public final Ls0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD/f0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v0

    iput-object v0, p0, Ls0/b;->a:LD/f0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lt0/l;Lg2/i;Ljava/util/function/Consumer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lt0/l;",
            "Lg2/i;",
            "Ljava/util/function/Consumer<",
            "Landroid/view/ScrollCaptureTarget;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x1

    const/4 p3, 0x0

    const/16 p4, 0x10

    new-array v0, p4, [Ls0/c;

    invoke-virtual {p2}, Lt0/l;->a()Lt0/k;

    move-result-object p2

    new-instance v1, LF/d;

    new-array p4, p4, [Lt0/k;

    invoke-direct {v1, p4}, LF/d;-><init>([Ljava/lang/Object;)V

    invoke-virtual {p2, p3, p3, p3}, Lt0/k;->g(ZZZ)Ljava/util/List;

    move-result-object p2

    :goto_0
    iget p4, v1, LF/d;->f:I

    invoke-virtual {v1, p4, p2}, LF/d;->d(ILjava/util/List;)V

    :cond_0
    :goto_1
    invoke-virtual {v1}, LF/d;->k()Z

    move-result p2

    if-eqz p2, :cond_8

    iget p2, v1, LF/d;->f:I

    sub-int/2addr p2, p1

    invoke-virtual {v1, p2}, LF/d;->m(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt0/k;

    invoke-virtual {p2}, Lt0/k;->c()Ln0/Y;

    move-result-object p4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ln0/Y;->x0()Z

    move-result p4

    goto :goto_2

    :cond_1
    move p4, p3

    :goto_2
    if-nez p4, :cond_0

    sget-object p4, Lt0/n;->m:Lt0/q;

    iget-object v2, p2, Lt0/k;->d:Lt0/g;

    iget-object v2, v2, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v2, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_0

    sget-object p4, Lt0/n;->i:Lt0/q;

    invoke-interface {v2, p4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lt0/k;->c()Ln0/Y;

    move-result-object p4

    const/4 v3, 0x0

    if-eqz p4, :cond_7

    invoke-static {p4}, LZ0/d;->l(Ln0/Y;)LV/d;

    move-result-object p4

    iget v4, p4, LV/d;->a:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v5, p4, LV/d;->b:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    iget v6, p4, LV/d;->c:F

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    iget p4, p4, LV/d;->d:F

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    if-ge v4, v6, :cond_0

    if-lt v5, p4, :cond_3

    goto :goto_1

    :cond_3
    sget-object p4, Lt0/f;->e:Lt0/q;

    invoke-virtual {v2, p4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_4

    move-object p4, v3

    :cond_4
    check-cast p4, Lo2/e;

    sget-object p4, Lt0/n;->p:Lt0/q;

    invoke-virtual {v2, p4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, p4

    :goto_3
    if-nez v3, :cond_6

    invoke-virtual {p2, p3, p3, p3}, Lt0/k;->g(ZZZ)Ljava/util/List;

    move-result-object p2

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_7
    const-string p1, "Expected semantics node to have a coordinator."

    invoke-static {p1}, LZ0/d;->T(Ljava/lang/String;)V

    throw v3

    :cond_8
    const/4 p2, 0x2

    new-array p2, p2, [Lo2/c;

    sget-object p4, Ls0/a;->f:Ls0/a;

    aput-object p4, p2, p3

    sget-object p4, Ls0/a;->g:Ls0/a;

    aput-object p4, p2, p1

    new-instance p1, Lf2/a;

    invoke-direct {p1, p2}, Lf2/a;-><init>([Lo2/c;)V

    invoke-static {v0, p3, p3, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    return-void
.end method
