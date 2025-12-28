.class public final LU1/c;
.super Lr2/a;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/text/TextPaint;

.field public final synthetic d:Lr2/a;

.field public final synthetic e:LU1/d;


# direct methods
.method public constructor <init>(LU1/d;Landroid/content/Context;Landroid/text/TextPaint;Lr2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU1/c;->e:LU1/d;

    iput-object p2, p0, LU1/c;->b:Landroid/content/Context;

    iput-object p3, p0, LU1/c;->c:Landroid/text/TextPaint;

    iput-object p4, p0, LU1/c;->d:Lr2/a;

    return-void
.end method


# virtual methods
.method public final Q(I)V
    .locals 1

    iget-object v0, p0, LU1/c;->d:Lr2/a;

    invoke-virtual {v0, p1}, Lr2/a;->Q(I)V

    return-void
.end method

.method public final R(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, LU1/c;->c:Landroid/text/TextPaint;

    iget-object v1, p0, LU1/c;->e:LU1/d;

    iget-object v2, p0, LU1/c;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, LU1/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, LU1/c;->d:Lr2/a;

    invoke-virtual {v0, p1, p2}, Lr2/a;->R(Landroid/graphics/Typeface;Z)V

    return-void
.end method
