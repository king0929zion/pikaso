.class public final LU1/a;
.super Lr2/a;
.source "SourceFile"


# instance fields
.field public final b:Landroid/graphics/Typeface;

.field public final c:LA/t;

.field public d:Z


# direct methods
.method public constructor <init>(LA/t;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LU1/a;->b:Landroid/graphics/Typeface;

    iput-object p1, p0, LU1/a;->c:LA/t;

    return-void
.end method


# virtual methods
.method public final Q(I)V
    .locals 1

    iget-boolean p1, p0, LU1/a;->d:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LU1/a;->c:LA/t;

    iget-object p1, p1, LA/t;->e:Ljava/lang/Object;

    check-cast p1, LS1/b;

    iget-object v0, p0, LU1/a;->b:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, LS1/b;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LS1/b;->h(Z)V

    :cond_0
    return-void
.end method

.method public final R(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, LU1/a;->d:Z

    if-nez p2, :cond_0

    iget-object p2, p0, LU1/a;->c:LA/t;

    iget-object p2, p2, LA/t;->e:Ljava/lang/Object;

    check-cast p2, LS1/b;

    invoke-virtual {p2, p1}, LS1/b;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, LS1/b;->h(Z)V

    :cond_0
    return-void
.end method
